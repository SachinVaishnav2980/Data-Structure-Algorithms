package DLL;
public class DLL {
    

    public Node head;
    public Node tail;
    int size;

    //Insert at very first location.
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }

    //Insert at last location.
    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            node.prev=null;
            head=node;
        }
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        last.next=node;
        node.prev=last;
        last=node;
        node.next=null;
        size++;
    }

    //Insert at given location.
    public void insertAtPos(int value, int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size-1){
            insertLast(value);
        }
        Node node=new Node(value);
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        node.prev=temp;
        temp.next=node;
        size++;
    }

    //Insert at given location.
    //If index is not given value is given
    public Node find(int after){
            Node node=head;
            while (node!=null) {
                if(node.val==after){
                    return node;
                }
                node=node.next;
            }
            return node;
    }

    public void insertAfter(int after, int value ){
        Node p=find(after);
        if(p==null){
            System.out.println("Node does not exist");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    //Deleting from beginning
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
        head.next.prev=null;
    }

    //Delete from end
    public void deleteEnd(){
        Node node=head;
        Node last=null;
        while(node!=null){ 
            last=node;
            last.next=null;
            node.prev=null;
        }
    }

    //For display 
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");

        // System.out.println("Print in reverse");
        // while(last!=null){
        //     System.out.print(last.val +" -> ");
        //     last=last.prev;
        // }
        // System.out.println("START");

    }


    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node prev, Node next){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
