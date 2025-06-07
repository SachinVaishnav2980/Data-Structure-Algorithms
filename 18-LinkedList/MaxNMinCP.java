// A critical point in a linked list is defined as either a local maxima or a local minima.
// A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
// A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
// Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
// Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1].

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.ArrayList;

public class MaxNMinCP {
    public static void main(String[] args) {
        
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        // ListNode temp=head;
        // int len=0;
        // while (temp!=null) {
        //     len++;
        //     temp=temp.next;
        // }
        // if(len<3){
        //     return new int []{-1,-1};
        // }
        // ListNode prev=head;
        // ListNode curr=prev.next;
        // ArrayList<Integer> list=new ArrayList<>();
        // while (curr.next!=null) {
        //     if(curr.val<prev.val && curr.val<curr.next.val){
        //     int temp=head;
        //     int index=0;
        //     while(temp!=curr){
        //         index++;
        //     }
        //     list.add(index);
        // }
        // if(curr.val>prev.val && curr.val>curr.next.val){
        //     int temp=head;
        //     int index=0;
        //     while(temp!=curr){
        //         index++;
        //     }
        //     list.add(index);
        //     }
        //     prev=curr;
        //     curr=curr.next;   
        // }
        // int min=list.get(1)-list.get(1);      
        // int max=list.get(list.size()-1)-list.get(0);
        // return new int[]{min, max};
    }
}
