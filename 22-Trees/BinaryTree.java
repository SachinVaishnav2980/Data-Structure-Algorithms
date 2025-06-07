import java.util.Scanner;

public class BinaryTree{
    
    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node (int value){
            this.value=value;
        }

    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node value:");
        int value=scanner.nextInt();
        this.root=new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert the value to the left of:"+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value you want to insert in left of:"+node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert the value to the right of:"+node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value you want to insert in right of:"+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }

    public void display(Node node, String indent){
        if(node==null){
            return; 
        }
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void preetyDisplay(){
        preetyDisplay(root, 0);
    }
    public void preetyDisplay(Node node, int level){
        if(node==null){
            return ;
        }

        preetyDisplay(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }else{
            System.out.println(node.value);
        }
        preetyDisplay(node.left,level+1);

    }
}

// import java.util.Scanner;

// public class BinaryTree{

//     public BinaryTree(){

//     }

//     private class Node{
//         int value;
//         Node left;
//         Node right;
//         int height;

//         public Node(int value){
//             this.value=value;
//         }
//     }
    
//     private Node root;

//     public void populate(Scanner scanner){
//         System.out.println("Enter the valye of root node:");
//         int value=scanner.nextInt();
//         Node root=new Node(value);
//         populate(scanner, root);
//     }

//     public void populate(Scanner scanner, Node root){
//         System.out.println("Do you want to enter value to left of "+ root.value);
//         boolean left=scanner.nextBoolean();
//         if(left){
//             System.out.println("Enter the value:");
//             int value=scanner.nextInt();
//             root.left=new Node(value);
//             populate(scanner, root.left);
//         }
//         System.out.println("Do you want to enter value to right of "+ root.value);
//         boolean right=scanner.nextBoolean();
//         if(right){
//             System.out.println("Enter the value:");
//             int value=scanner.nextInt();
//             root.right=new Node(value);
//             populate(scanner, root.left);
//         }
//     }

//     public void display(){
//         display(this.root, 0);
//     }

//     public void display(Node root, int level){
//         if(root==null){
//             return ;
//         }
//         display(root.right, level+1);
//         if(level!=0){
//             for(int i=0;i<level-1;i++){
//                 System.out.print("|\t\t");
//             }
//             System.out.println("------->"+root.value);
//         }else{
//             System.out.println("-------> "+root.value);
//         }
//         display(root.left, level+1);
//     }

// }