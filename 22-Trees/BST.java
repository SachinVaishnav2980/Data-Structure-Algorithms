public class BST {

    public BST(){

    } 


    private static class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    } 

    private Node root;

    public int getHeight(){
        return getHeight(root);
    }

    public int getHeight(Node node){
        if(root==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    } 

    public void insert(int value){
        root=insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }

        if(value<node.value){
            node.left=insert(value, node.left);
        }

        if(value>node.value){
            node.right=insert(value, node.right);
        }

        node.height=Math.max(getHeight(node.left), getHeight(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node node){
        if(node == null) return true;

        return (Math.abs(getHeight(node.left)-getHeight(node.right))<=1) && balanced(node.left) && balanced(node.right);
    }

    public void populateSorted(int []nums){
        populateSorted(nums, 0, nums.length);
    }

    public void populateSorted(int []nums, int start, int end){
        if(start>=end) return;

        int mid=(start+end)/2;
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid+1, end);
    }
}
