
public class CustomStack {
    public int []data;
    public static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);  //this will create a default size stack constructor calling another constructor
    }

    public  CustomStack(int size){
        this.data=new int[size];  //this will create a stack of given size;
    }
    
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            //Here we are calling the defind Exception class for throwing an error.
            // throw new Exception("cannot pop from an empty stack !!");
            //Now we are calling the custom Stack exception class for exceptional handling
            throw new StackException("cannot pop from an empty stack !!");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            //Here we are calling the defind Exception class for throwing an error.
            // throw new StackException("cannot peek from an empty stack!!");
            //Now we are calling the custom Stack exception class for exceptional handling
            throw new StackException("cannot pop from an empty stack !!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1; //ptr at the last index means stack is full.
    }
    public boolean isEmpty(){
        return ptr==-1; //ptr at the -1 index means stack is empty
    }

}

