import java.util.PriorityQueue;

public class MergeKLL {

    class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
    Node mergeKLists(Node[] arr) {
        // code here
        PriorityQueue<Node> queue=new PriorityQueue<>((a, b)-> a.data-b.data);
        for (Node node:arr) {
            if (node!=null) {
                queue.add(node);    
            }
        }

        Node head=new Node(0);
        Node tail=head;

        while (!queue.isEmpty()) {
            Node curr=queue.poll();
            tail.next=curr;
            tail=tail.next;
            if(curr.next!=null){
                queue.add(curr.next);
            }
        }
        return head.next;
    }
}
