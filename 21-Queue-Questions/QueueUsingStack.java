//This code will be add efficient means 
// add-O(1)
// remove-O(n)
import java.util.Stack;
public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStack(){
        first=new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

    }


    public boolean isEmpty(){
        return first.isEmpty();
    }
}
