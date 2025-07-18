import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> strStack=new Stack<>();
        StringBuilder currStr=new StringBuilder();
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                numStack.push(k);
                strStack.push(currStr);
                currStr=new StringBuilder();
                k=0;
            }else if(ch==']'){
                StringBuilder lastString=new StringBuilder();
                int count=numStack.pop();
                for(int i=0;i<count;i++){
                    lastString.append(currStr);
                }
                currStr=strStack.pop().append(lastString)
            }else{
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}
