package Heaps2;
import java.util.*;
public class BSTtoMaxHeap {

    class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
    public static void convertToMaxHeapUtil(Node root) {
        // code here
        List<Integer> inorder=new ArrayList<>();
        inorder(root, inorder);
        int[] index = {0};
        postOrder(root, inorder, index);
        
    }

    static void inorder(Node node, List<Integer> list){
        if(node==null){
            return ;
        }
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }

    static void postOrder(Node node, List<Integer> list, int[] index){
        if(node==null){
            return ;
        }

        postOrder(node.left, list, index);
        postOrder(node.right, list, index);
        node.data= list.get(index[0]);
        index[0]++;
    }


}
