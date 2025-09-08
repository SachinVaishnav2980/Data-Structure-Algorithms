package TreeTraversal;

public class ValidateBT {
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

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node==null) return true;

        if(low!=null && node.val<=low){  //low!=null coz we r taking min integer value so it cannot be null
            return false;
        }

        if(high!=null && node.val>=high){  //high!=null coz we r taking max integer value so it cannot be null
            return false;
        }

        boolean left=helper(node.left, low, node.val);
        boolean right=helper(node.right, node.val, high);
        return left && right;
    }
}
