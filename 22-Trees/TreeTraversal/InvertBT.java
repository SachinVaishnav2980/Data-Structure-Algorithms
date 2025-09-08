package TreeTraversal;

public class InvertBT {
    public static void main(String[] args) {
        
    }
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

    public TreeNode invertTree(TreeNode root) {
        return invertChild(root);
    }

    public TreeNode invertChild(TreeNode node){
        if(node==null){
            return null;
        }

        TreeNode leftnode=invertChild(node.left);
        TreeNode rightnode=invertChild(node.right);

        node.left=rightnode;
        node.right=leftnode;

        return node;
    }
}
