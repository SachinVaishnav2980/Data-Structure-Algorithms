import java.util.Stack;

public class RemoveOuterParen {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder next=new StringBuilder();
        int depth=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    next.append(ch);
                }
                depth++;
            }else{
                depth--;
                if(depth>0){
                    next.append(ch);
                }
            }
        }
        return next.toString();
    }
}
