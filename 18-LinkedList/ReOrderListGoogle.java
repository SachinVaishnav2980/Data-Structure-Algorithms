
public class ReOrderListGoogle {
    // import LinkedList.LL.ListNode;
    public static void main(String[] args) {
        LL list=new LL();
        ListNode node=new ListNode(0);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        ListNode head=new ListNode(0);

    }

    public static ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int value){
            this.val=value;
        }

        public ListNode(int value, ListNode next){
            this.val=value;
            this.next=next;
        }
    }
}
