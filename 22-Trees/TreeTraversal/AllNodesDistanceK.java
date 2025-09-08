package TreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AllNodesDistanceK {
    public static void main(String[] args) {
        
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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

    Map<TreeNode, TreeNode> cpmap=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list=new ArrayList<>();
        preorderMap(root, null);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(target);
        Set<TreeNode> visited=new HashSet<>();
        while(!queue.isEmpty() && k!=0){
            k-=1;
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr=queue.poll();
                visited.add(curr);
                if(!visited.contains(cpmap.get(curr)) && cpmap.get(curr)!=null){
                    queue.offer(cpmap.get(curr));
                }
                if(!visited.contains(curr.left) && curr.left!=null){
                    queue.offer(curr.left);
                }
                if(!visited.contains(curr.right) && curr.right!=null){
                    queue.offer(curr.right);
                }
            }
        }

        while (!queue.isEmpty()) {
            list.add(queue.poll().val);
        }
        return list;
    }

    void preorderMap(TreeNode child, TreeNode parent){
        if(child==null){
            return;
        }

        cpmap.put(child, parent);
        preorderMap(child.left, child);
        preorderMap(child.right, child);
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        int []index={0};
        return helper(preorder, inorder, 0, preorder.length-1, map, index);
    }

    TreeNode helper(int[] preorder, int[] inorder, int left, int right, Map<Integer, Integer> map, int []index){
        if(left>right) return null;

        int curr=preorder[index[0]];
        index[0]++;
        TreeNode node=new TreeNode(curr);

        if(left==right){
            return node;
        }

        node.left=helper(preorder, inorder, left, index[0]-1, map, index);
        node.right=helper(preorder, inorder, index[0]+1, right, map, index);
        return node;
    }
}
