import java.util.Stack;

public class DeleteMidStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        deleteMid(stack);
    }

    public static void deleteMid(Stack<Integer> s) {
        if(s.isEmpty()){
            return ;
        }
        Stack<Integer> spare=new Stack<>();
        int index=(s.size()+1)/2;
        int size=s.size();
        for(int i=0;i<size-index;i++){
            spare.push(s.pop());
        }   
        s.pop();
        while(!spare.isEmpty()){
            s.push(spare.pop());
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
