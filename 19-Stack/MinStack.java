import java.util.Stack;
//1st approach two stack operation
// public class MinStack {
//     Stack<Integer> stack = new Stack<>();
//     Stack<Integer> minStack = new Stack<>();

//     public MinStack() {
//     }

//     public void push(int val) {
//         stack.push(val);
//         if (minStack.isEmpty() || val <= minStack.peek()) {
//             minStack.push(val);
//         }
//     }

//     public void pop() {
//         int element = stack.pop();
//         if (element == minStack.peek()) {
//             minStack.pop();
//         }
//     }

//     public int top() {
//         return stack.peek();
//     }

//     public int getMin() {
//         return minStack.peek();
//     }

//     public static void main(String[] args) {
//         MinStack obj=new MinStack();
//         obj.push(-2);
//         obj.push(0);
//         obj.push(-3);
//         System.out.println(obj.getMin());
//         obj.pop();
//          System.out.println(obj.top()); 
//         System.out.println(obj.getMin());
//     }
// }


public class MinStack {
    Stack<Integer> stack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        
    }

    public void pop() {
        
    }

    public int top() {
        
    }

    public int getMin() {
      
    }

    public static void main(String[] args) {
        MinStack obj=new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
         System.out.println(obj.top()); 
        System.out.println(obj.getMin());
    }
}