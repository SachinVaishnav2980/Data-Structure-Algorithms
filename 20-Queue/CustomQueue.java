

public class CustomQueue {

    public int []data;
    public static final int DEFAULT_SIZE=10;
    int end=0;
    
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int removed=data[0];
        //Shift the element to left.
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        return end==data.length-1; //ptr at the last index means stack is full.
    }
    public boolean isEmpty(){
        return end==0; //ptr at the -1 index means stack is empty
    }
}
