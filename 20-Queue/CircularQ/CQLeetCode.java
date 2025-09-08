package CircularQ;

public class CQLeetCode {
    public static void main(String[] args) {
        
    }
}

class MyCircularQueue {
    public int queue[];
    protected int front;
    protected int rear;
    public int size;
    protected int count=0;

    public MyCircularQueue(int k) {
        this.size=k;
        queue=new int[k];
        front=0;
        rear=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        queue[rear]=value;
        rear =(rear+1)%size;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%size;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
}
