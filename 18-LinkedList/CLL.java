public class CLL {
    
    private Node head;
    private Node tail;

    public CLL(){
        this.head=null;
        this.tail=null;
    }

    //Insert node
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    //Delete a node.
    public void delete(int value){
        Node node=head;
        if(node==null){
            return ;
        }
        //for 1 node only.
        if(head==tail){
            head=null;
            tail=null;
            return ;    
        }
        //if first node
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return ;
        }
        //delete in between 
        while(node!=tail){
            Node n=node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }
    }

    //To display.
    public void display(){
        Node node=head;
        if(node!=null){
            do{
                System.out.print(node.value+" -> ");
                if(node.next!=null){
                    node=node.next;
                }
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    private class Node{
        int value;
        Node next;

    public Node(int value){
            this.value=value;
        }
    }
}

