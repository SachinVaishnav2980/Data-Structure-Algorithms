package TreeTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int height;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }

                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
        }
        return true;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return binarytree(nums, 0, nums.length - 1);
    }

    public TreeNode binarytree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = binarytree(nums, left, mid - 1);
        head.right = binarytree(nums, mid + 1, right);
        return head;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left, right) + 1;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return rootToLeafPath(root, targetSum);
    }

    boolean rootToLeafPath(TreeNode node, int targetSum) {
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
            return node.val==targetSum;
        }
        boolean left=rootToLeafPath(node.left, targetSum-node.val);
        boolean right=rootToLeafPath(node.right, targetSum-node.val);
        return left||right;
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    void invert(TreeNode node){
        if(node==null){
            return ;
        }
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        invert(node.left);
        invert(node.right);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        StringBuilder sb=new StringBuilder();
        helper(root, list, sb);
        return list;
    }

    void helper(TreeNode node, List<String> list, StringBuilder sb){
        if(node==null){
            return ;
        }
        int len=sb.length();
        if(node.left==null && node.right==null){
            sb.append(node.val);
            list.add(sb.toString());
        }else{
            sb.append(node.val).append("->");
            helper(node.left, list, sb);
            helper(node.right, list, sb);
        } 
        sb.setLength(len);
    }

    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        helper(root, true); 
        return sum;
    }

    void helper(TreeNode node, boolean flag){
        if(node==null)return ;
        if(node.left==null && node.right==null && flag==true){
            sum+=node.val;
            return;
        }
        helper(node.left, true);
        helper(node.right, false);
    }

    public int[] findMode(TreeNode root) {
        if(root==null){
            return new int[]{0};
        }
        Map<Integer, Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        inorder(root, list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
            max=Math.max(max, map.get(list.get(i)));
        }

        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==max){
                res.add(entry.getKey());
            }
        }
        int []ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }

    void inorder(TreeNode node, List<Integer> list){
        if(node==null){
            return ;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    int diff=Integer.MAX_VALUE;
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root);
        return diff;
    }

    void helper(TreeNode node){
        if(node==null){
            return ;
        }
        helper(node.left);
        if(prev!=null){
            diff=Math.min(diff, Math.abs(node.val-prev.val));
        }
        prev=node;
        helper(node.right);
    }

    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        finalans(root);
        return diameter-1;
    }

    int finalans(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=finalans(node.left);
        int right=finalans(node.right);
        int dia=left+right+1;
        diameter=Math.max(diameter, dia);
        return Math.max(left, right)+1;
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int val=root.val;
        return helper1(root, val);
    }

    boolean helper1(TreeNode node , int value){
        if(node==null){
            return true;
        }
        if(node.val!=value){    
            return false;
        }   
        return helper1(node.left, value) && helper1(node.right, value);
    }
}
