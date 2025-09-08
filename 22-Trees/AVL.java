public class AVL {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;
    public AVL(){};

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
        return rotate(node);
    }

    public Node rotate(Node node){
        if(getHeight(node.left)-getHeight(node.right)>1){
            //left heavy
            if(getHeight(node.left.left)-getHeight(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }
            if(getHeight(node.left.left)-getHeight(node.left.right)<0){
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getHeight(node.left)-getHeight(node.right)<-1){
            //right heavy
            if(getHeight(node.right.left)-getHeight(node.right.right)<0){
                //right-right case
                return leftRotate(node);
            }
            if(getHeight(node.right.left)-getHeight(node.right.right)>0){
                //right-left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c=p.left;
        Node t=p.right;

        c.right=p;
        p.left=t;
        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        return c;
    }

    public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;
        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        return p;
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
