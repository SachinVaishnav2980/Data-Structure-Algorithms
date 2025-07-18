import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println(removeDuplicates(s));
    }
    //O(n^2)
    // public static String removeDuplicates(String s) {
    //     Stack<Character> stack=new Stack<>();
    //     while(!s.isEmpty()){
    //         char ch=s.charAt(0);
    //         if(stack.isEmpty() || ch!=stack.peek()){
    //             stack.push(ch);
    //         }else{
    //             stack.pop();
    //         }
    //         s=s.substring(1);
    //     }
    //     StringBuilder next=new StringBuilder();
    //     while (!stack.isEmpty()) {
    //         next.append(stack.pop());
    //     }
    //     next.reverse();
    //     return next.toString();
    // }

    //O(n)
    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(stack.isEmpty() || ch!=stack.peek()){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }

        StringBuilder next=new StringBuilder();
        for(char ch: stack){
            next.append(ch);
        }
        return next.toString();
    }
}
