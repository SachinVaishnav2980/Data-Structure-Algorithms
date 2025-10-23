package Heaps2;


public class IsMaxHeap {

    class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
    boolean isHeap(Node tree) {
        int size=count(tree);
        boolean second=check(tree, size, 0);
        boolean first=helper(tree);
        return first && second;
    }

    boolean helper(Node node){
        if(node==null){
            return true;
        }

        if(node.left!=null && node.data<node.left.data){
            return false;
        }

        if(node.right!=null && node.data<node.right.data){
            return false;
        }

        return helper(node.left) && helper(node.right);
    }

    int count(Node node){
        if(node==null){
            return 0;
        }
        return 1+count(node.left)+count(node.right);
    }

    boolean check(Node node, int size, int index){
        if(node==null){
            return true;
        }
        if(index>=size){
            return false;
        }

        return check(node.left, size, 2*index+1) && check(node.right, size, 2*index+2);
    }
}
