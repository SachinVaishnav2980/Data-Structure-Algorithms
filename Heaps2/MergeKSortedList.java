package Heaps2;
import java.util.*;
public class MergeKSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(ListNode element:lists){
            while(element!=null){
                pq.add(element.val);
                element=element.next;
            }
        }
        
        ListNode head=new ListNode(-1);
        ListNode tail=head;
        while (!pq.isEmpty()) {
            tail.next=new ListNode(pq.poll());
            tail=tail.next;
        }

        return head.next;
    }
}
