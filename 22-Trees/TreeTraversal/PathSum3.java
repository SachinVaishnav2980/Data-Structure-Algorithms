package TreeTraversal;

import java.util.*;

public class PathSum3 {
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

    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        helper(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }

    void helper(TreeNode node, int target){
        if(node==null){
            return ;
        }

        if(node.val==target){
           count++;
        } 

        helper(node.left, target-node.val);
        helper(node.right, target-node.val);
    }
}
