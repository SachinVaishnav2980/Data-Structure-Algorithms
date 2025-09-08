import java.util.*;
public class BinaryTree {

    public BinaryTree(){
        queue=new ArrayDeque<>();
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    } 

    private Node root;
    Queue<Integer> queue;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node:");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the left of "+node.value);
        Boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to the left of "+node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of "+node.value);
        Boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to the right of "+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    // public void display(){
    //     display(this.root, " ");
    // }

    // public void display(Node node, String indent){
    //     if (node == null) {
    //         return;
    // }
    //     System.out.println(indent + node.value);
    //     display(node.left, indent + "\t");
    //     display(node.right, indent + "\t");
    // }

    //Tree Traversal
    //1. BFS

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        if(queue.isEmpty()){
            return;
        }
        //We have root node now put its child in Queue
        System.out.println(node.value+" -> ");
        queue.add(node.left.value);
        queue.add(node.right.value);
        Node qnode=new Node(queue.remove());
        display(qnode);
    }

    public void preorder(){
        preorder(root);
    }

    public void preorder(Node node){
        if(node==null) return;
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(root);
    }

    public void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.value+" ");
        inorder(node.right);
    }

    public void postorder(){
        postorder(root);
    }

    public void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value+" ");
    }
}
