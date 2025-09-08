package TreeTraversal;

public class DiameterBT {
    public static void main(String[] args) {
        
    }
    TreeNode root;
    class TreeNode {
        int val;
        int height;
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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter-1;
    }

    public int getHeight(TreeNode node){
        if(node==null){
            return 0;
        }

        int leftHeight=getHeight(node.left);
        int rightHeight=getHeight(node.right);

        int dia=leftHeight+rightHeight+1;

        diameter=Math.max(diameter, dia);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
