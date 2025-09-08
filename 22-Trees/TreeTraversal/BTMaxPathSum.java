package TreeTraversal;

import java.util.ArrayList;

public class BTMaxPathSum {

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
    public static void main(String[] args) {
        
    }
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    int helper(TreeNode node){
        if(node==null) return 0;

        int left=Math.max(0, helper(node.left));
        int right=Math.max(0, helper(node.right));

        int pathSum=left+right+node.val;
        ans=Math.max(ans, pathSum);
        return Math.max(left, right)+node.val;
    }


    public boolean checkPath(TreeNode root, int []arr){
        return helper1(root, arr, 0);
    }

    public boolean helper1(TreeNode node, int []arr, int index){
        if(node==null) return false;

        if(node.left==null && node.right==null && index==arr.length-1) return true;
        if(index>=arr.length || node.val!=arr[index]) return false;

        return helper1(node.left, arr, index+1) && helper1(node.right, arr, index+1);
    }


    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null || q==null) return p==q;

        return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
