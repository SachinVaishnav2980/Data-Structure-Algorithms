import java.util.Scanner;
public class BinaryTree{

    public BinaryTree(){

    }

    private static  class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

    //insert elements 
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value=scanner.nextInt();
        Node root=new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of " +  node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of a left node");
            int value=scanner.nextInt(0);
            node.left=new Node(value);
            populate(scanner , Node.left);
        }  

        System.out.println("Do you want to enter right of " +  node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of a right node");
            int value=scanner.nextInt(0);
            node.right=new Node(value);
            populate(scanner , Node.right);
        }
    }
}