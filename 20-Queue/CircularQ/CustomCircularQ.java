package CircularQ;

public class CustomCircularQ {
    public int []data;
    public static final int DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    public int size=0;
    public CustomCircularQ(){
        this(DEFAULT_SIZE);
    }
    public CustomCircularQ(int size){
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.println("End");
    }


    public boolean isFull(){
        return size==data.length-1; //ptr at the last index means stack is full.
    }
    public boolean isEmpty(){
        return size==0; //ptr at the -1 index means stack is empty
    }
}
