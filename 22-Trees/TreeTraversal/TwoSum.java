package TreeTraversal;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        
    }

    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(){

        }

        public TreeNode(int val){
            this.val=val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> map=new HashSet<>();
        return helper(root, k, map);
    } 

    boolean helper(TreeNode node, int k, Set<Integer> map){
        if(node==null) return false;

        if(map.contains(k-node.val)){
            return true;
        }else{
            map.add(node.val);
        }

        return helper(node.left, k, map) || helper(node.right, k, map);
    }

}
