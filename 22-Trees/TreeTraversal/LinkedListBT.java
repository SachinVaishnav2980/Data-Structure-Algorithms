package TreeTraversal;



public class LinkedListBT {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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

    public boolean isSubPath(ListNode head, TreeNode root) {
    if (root == null) return false;
    return helper(head, root) 
        || isSubPath(head, root.left) 
        || isSubPath(head, root.right);
}

private boolean helper(ListNode head, TreeNode node) {
    if (head == null) return true;   
    if (node == null) return false;  
    if (head.val != node.val) return false;

    return helper(head.next, node.left) || helper(head.next, node.right);
}
}
