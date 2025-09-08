package TreeTraversal;
import java.util.*;

public class BTtoDLL {
    public static void main(String[] args) {
        
    }

    class TreeNode {
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

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public Node flattenBT(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        helper(root);
        return head;
        
    }

    void helper(TreeNode node){
        if(node==null){
            return ;
        }
        helper(node.left);
        Node newNode=new Node(node.val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        helper(node.right);
    }
}
