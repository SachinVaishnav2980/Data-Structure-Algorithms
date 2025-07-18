class CustomStack {
    private int size=0;
    private int top=-1;
    int []stack;

    public CustomStack(int maxSize) {
        this.size=maxSize;
        stack=new int[size];
    }
    
    public void push(int x) {
        if(top<size-1){
            top++;
            stack[top]=x;
        }
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        return stack[top--];
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k, top+1);
        for(int i=0;i<limit;i++){
            stack[i]+=val;
        }
    }
}

public class incrementStack{
    public static void main(String[] args) {
        CustomStack stack =new CustomStack(3);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5, 100);
        stack.increment(2, 100);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}