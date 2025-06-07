public class BST {
    public BST(){

    }

    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value=value;
        }

        public int getValue(){
            return value;
        }
    } 

    private Node root;  

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }        
    
    public boolean isEmpty(Node node){
        return node==null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node==null){
            return ;
        }
        System.out.println(details+ node.getValue());
        display(node.left, " Left child of "+node.getValue()+" : ");
        display(node.right, " Right child of "+node.getValue()+" : ");
    }
}
