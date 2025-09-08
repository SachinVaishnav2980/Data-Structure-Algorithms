
public class MinST {
    public static void main(String[] args) {
        int arr[]={34, 22, 35, 87, 1, 99, 0, 100};
        MinST tree=new MinST(arr);
        System.out.println(tree.query(1, 5));
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

    public MinST(int []arr){
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
        node.left=constructTree(arr, start, mid);
        node.right=constructTree(arr, mid+1, end);

        node.data=Math.min(node.left.data, node.right.data);
        return node;
    }

    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.data;
        }else if(node.startInterval>qei || node.endInterval<qsi){
            return Integer.MAX_VALUE;
        }else{
            return Math.min(this.query(node.left, qsi, qei), this.query(node.right, qsi, qei));
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
                node.data=Math.min(left, right);
                return node.data;
            }
        }
        return node.data;
    }
}
