public class PracticeST {
    public static void main(String[] args) {
        int []arr={2, 15, 20, 9, 29, 14, 5};
        PracticeST tree=new PracticeST(arr);
        System.out.println(tree.query(0, 3));
    }

    class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;

    public PracticeST(int []arr){
        this.root=constructTree(arr, 0, arr.length-1);
    }

    public Node constructTree(int []arr, int start, int end){
        if(start==end){
            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }

        Node node=new Node(start, end);
        int mid=(start+end)/2;
        node.left=this.constructTree(arr, start, mid);
        node.right=this.constructTree(arr, mid+1, end);

        node.data=Math.max(node.left.data, node.right.data);
        return node;
    }

    public int query(int start, int end){
        return this.query(this.root, start, end);
    }

    private int query(Node node, int start, int end){
        if(node.startInterval>=start && node.endInterval<=end){
            return node.data;
        }else if(node.startInterval>end || node.endInterval<start){
            return 0;
        }else{
            return Math.max(this.query(node.left, start, end), this.query(node.right, start, end));
        }
    }

    public void update(int index, int value){
        this.update(this.root, index, value);
    }

    private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data=value;
                return node.data;
            }else{
                int left=update(node.left, index, value);
                int right=update(node.right, index, value);
                node.data=Math.max(left, right);
                return node.data;
            }
        }
        return node.data;
    }

}
