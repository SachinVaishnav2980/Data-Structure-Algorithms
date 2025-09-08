package TreeTraversal;

import java.util.ArrayList;

public class KthSmallestElementBT {
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
    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> list=new ArrayList<>();
        listBT(root, list);
        return list.get(k-1);
    }

    public void listBT(TreeNode node, ArrayList<Integer> list){
        if(node==null){
            return ;
        }
        listBT(node.left, list);
        list.add(node.val);
        listBT(node.right, list);
    }

}
