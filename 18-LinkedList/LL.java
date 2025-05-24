public class LL {

    private Node head;
    private Node tail;
    private int size;
    
    public LL(){
        this.size=0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

        //Insertion by using recursion 
        public void insertRec(int val, int index){
            head=insertRec(val, index, head);
        }

        public Node insertRec(int val, int index, Node node){
            if(index==0){
                Node temp=new Node(val,node);
                size++;
                return temp;
            }

            node.next=insertRec(val, index--, node.next);
            return node;
        }
        //For inserting node at first position.
        public void insertFirst(int value){
            Node node = new Node(value);
            node.next=head;
            head=node;

            if(tail == null){
                tail=head;
            }
            size+=1;
        }

        //For inserting in last.
        public void insertLast(int value){
            Node node=new Node(value);
            if(tail==null){
                insertFirst(value);
                return ;
            }
            tail.next=node;
            tail=node;
            size+=1;
        }

        //For inserting in between nodes.
        public void insertAtPos(int value, int index){
            if(index==0){
                insertFirst(value);
                return;
            }
            if(index==size){
                insertLast(value);
                return;
            }
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
        }

        //For deleting from first.
        public int deleteFirst(){
            int value=head.value;
            head=head.next;
            if(head == null){
                tail=null;
            }
            size--;
            return value;
        }

        //For deleting from last.
        //1.1 for finding the when index is given.
        public Node get(int index){
            Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;
        }

        public int deleteLast(){
            Node node=get(size-2);
            if(size<=1){
                deleteFirst();
            }
            int value=tail.value;
            tail=node;
            tail.next=null;
            size--;
            return value;

        }

        //For deleting from any particular index.
        public int deleteIndex(int index){
            if(index==0){
                deleteFirst();
            }
            if(index==size-1){
                deleteLast();
            }
            Node prev=get(index-1);
            int value=prev.next.value;
            prev.next=prev.next.next;
            size--;
            return value;
        }

        //For finding the node on giving the value.
        public Node find(int value){
            Node node=head;
            while (node!=null) {
                if(node.value==value){
                    return node;
                }
                node=node.next;
            }
            return node;
        }

        //For display LL.
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value + " -> ");
                temp=temp.next;
            }
            System.out.println("End");
        }



        //Remove duplicates from list
        public void removeDuplicate(){
            Node node=head;
            while(node.next!=null){
                if(node.value==node.next.value){
                    node.next=node.next.next;
                    size--;
                }else{
                    node=node.next;
                }
            }
            tail=node;
            tail.next=null;
        }

        //Merge two list
        public static LL merge(LL first, LL second){
            Node f=first.head;
            Node s=second.head;
            LL ans=new LL();
            while(f!=null && s!=null){
                if(f.value<s.value){
                    ans.insertLast(f.value);
                    f=f.next;
                }else{
                    ans.insertLast(s.value);
                    s=s.next;
                }
            }

            while(f!=null){
                ans.insertLast(f.value);
                f=f.next;
            }

            while(s!=null){
                ans.insertLast(s.value);
                s=s.next;
            }
            return ans;
        }

        //Cycle detection in LL.
        public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //Length of the cycle.
    public int lengthOfCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){ 
                int length=0;
                Node temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=fast);
                return length;
            }
        }
        return -1;
    }

    //Cycle Detection and first element of cycle
    public Node detectCycle(Node head) {
        Node fast=head;
        Node slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){ 
                length=lengthOfCycle(head);
                break;
            }
        }
        if(length==0){
            return null;
        }
        Node f=head;
        Node s=head;
        while (length>0) {
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }

    //Middle Node of a linked list
    public Node middleNode(Node head) {
        Node fast=head;
        Node slow= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        return slow;
    }

    //Merge sort in LL
    public Node sortList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node mid=middleNode(head);
        Node left=sortList(head);
        Node right=sortList(mid);
        return merge(left, right);
    }
        public Node merge(Node list1, Node list2){
            Node dummyHead=new Node(0);
            Node tail=dummyHead;

            while(list1!=null && list2!=null){
                if(list1.value <list2.value){
                    tail.next=list1;
                    list1=list1.next;
                    tail=tail.next;
                }else{
                    tail.next=list2;
                    list2=list2.next;
                    tail=tail.next;
                }
            }

            while(list1!=null){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            while(list2!=null){
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
            return dummyHead.next;
        }

        //Recursive approach for reversing a list.
        private void reverseRec(Node node){
            if(node==tail){
                head=tail;
                return ;
            }
            reverseRec(node.next);
            tail.next=node; 
            tail=node;
            tail.next=null;
        }

        //Iterative approach for reversing a list.
        public void reverseIter(){
            if(size<2){
                return;
            }
            Node curNode=head;
            Node nextNode=head;
            Node prevNode=null;
            while(nextNode!=null){
                nextNode=nextNode.next;
                curNode.next=prevNode;
                prevNode=curNode;
                curNode=nextNode;
            }
            head=prevNode;
        }

        //Iterative approach for reversing a list for leetcode.
        public Node reverseIter(Node head){
            if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
        }

        //Reverse a list between portion.
        public Node reverseBetween(Node head, int left, int right) {
        if(left==right){
            return head;
        }
        Node prevNode=null;
        Node currNode=head;
        for(int i=0;currNode!=null && i<left-1;i++){
            prevNode=currNode;
            currNode=currNode.next;
        }
        Node curr=currNode;
        Node next=currNode.next;
        Node prev=prevNode;
        for(int i=0;currNode!=null && i<right-left+1;i++){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(prev!=null){
            prev.next=prevNode;
        }else{
            head=prevNode;
        }
        curr.next=currNode;
        return head;
    }

    //Palindrome List
    public Boolean isPalindrome(Node head){
        Node mid=middleNode(head);
        Node head2=reverseIter(mid);
        Node head3=head2;
        while(head!=null && head2!=null){
            if(head.value!=head2.value){
                break;
            }
            head=head.next;
            head2=head2.next;
        }
        reverseIter(head3);
        if(head==null || head2==null){
            return true;
        }
        return false;
    }

    //Reorder list
    public void reorderList(Node head) {
        Node head1=head;
        if(head==null || head.next==null){
            return ;
        }
        Node mid=middleNode(head);
        Node head2=reverseIter(mid);
        while(head1!=null && head2!=null){
            Node temp=head1.next;
            head1.next=head2;
            head1=temp;

            temp=head2.next;
            head2.next=head1;
            head2=temp;
        }

        if(head1!=null){
            head1.next=null;
        }
    }
}