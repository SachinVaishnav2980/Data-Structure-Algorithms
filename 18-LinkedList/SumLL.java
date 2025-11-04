public class SumLL {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp=l1;
        ListNode temp1=l2;

        ListNode prev=null;
        ListNode prev1=null;

        while (temp!=null) {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=temp.next;
        }
        l1=prev;

        while (temp1!=null) {
            ListNode next=temp.next;
            temp.next=prev1;
            prev1=temp1;
            temp1=temp1.next;
        }
        l2=prev1;

        ListNode node1=l1;
        ListNodde node2=l2;
        ListNode head=null;

        while (node1!=null && node2!=null) {
            int sum=node1.val+node2.val;
            int digit=0;
            if(sum>9){
                digit=sum%10;
                sum=sum/10;
            }else{
                
            }

            ListNode newNode=new ListNode(digit);
            head.next=newNode;

        }
        
    }
}
