

public class StringLength {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(stringLength(s,0));
    }

    public static int stringLength(String s, int length){
        if(s.isEmpty()){
            return length;
        }
        return stringLength(s.substring(1), length+1);
    }

    // Time complexity - O(n^2) 
    // O(n) because of substring method.
    // O(n) for n recursion calls.

    // Space complexity - O(n)
}





