//This program reverse a char array.

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char []s={'H','a','n','n','a','h'};
        reverseString(s, 0);
    }

    public static void reverseString(char []s, int index){
        int mid=(s.length-1)/2;
        if(index>mid){
            System.out.println(Arrays.toString(s));
            return;
        }
        int j=s.length-1-index;
        char temp=s[index];
        s[index]=s[j];
        s[j]=temp;
        reverseString(s, index+1);
    }
}
