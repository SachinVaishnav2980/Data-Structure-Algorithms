package TreeTraversal;

import java.util.ArrayList;
import java.util.List;

public class PostOrderBT {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root, list);
        return list;
    }

    void helper(TreeNode node, List<Integer> list){
        if(node==null) return;
        helper(node.left, list);
        helper(node.right, list);
        list.add(node.val);
    }
}
