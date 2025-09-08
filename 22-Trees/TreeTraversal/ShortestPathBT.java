package TreeTraversal;

public class ShortestPathBT {
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

    public String getDirections(TreeNode root, int startValue, int destValue) {
        // TreeNode lca = lowestCommonAncestor(root, startValue, destValue);
        StringBuilder sourceToLca=new StringBuilder();
        findPath(root, startValue, sourceToLca);
        StringBuilder lcaToDest=new StringBuilder();
        findPath(root, destValue, lcaToDest);
        StringBuilder res=new StringBuilder();
        int p1=0;
        int p2=0;
        while (p1<sourceToLca.length() && p2<lcaToDest.length()) {
            if(sourceToLca.charAt(p1)==lcaToDest.charAt(p2)){
                p1++;
                p2++;
            }else{
                break;
            }
        }

        for(int i=p1;i<sourceToLca.length();i++){
            res.append("U");
        }
        for(int i=p2;i<lcaToDest.length();i++){
            res.append(lcaToDest.charAt(i));
        }
        return res.toString();

    }

    boolean findPath(TreeNode node, int target, StringBuilder str) {
        if (node == null) {
            return false;
        }

        if (node.val == target) {
            return true;
        }

        if (node.left != null) {
            str.append("L");
            if (findPath(node.left, target, str)) {
                return true;
            }
            str.deleteCharAt(str.length() - 1);
        }
        if (node.right != null) {
            str.append("R");
            if (findPath(node.right, target, str)) {
                return true;
            }
            str.deleteCharAt(str.length() - 1);
        }
        return false;
    }

    TreeNode lowestCommonAncestor(TreeNode node, int p, int q) {
        if (node == null) {
            return node;
        }

        if (node.val == p || node.val == q) {
            return node;
        }

        TreeNode left = lowestCommonAncestor(node.left, p, q);
        TreeNode right = lowestCommonAncestor(node.right, p, q);

        if (left != null && right != null) {
            return node;
        }
        return left == null ? right : left;
    }
}
