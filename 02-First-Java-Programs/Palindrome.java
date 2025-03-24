import java.util.Scanner;
import java.lang.String;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String name=sc.nextLine();
        // String name="khanahk";
        int len= name.length();
        String fullname="";
        for(int i=len-1;i>=0;i--){
            fullname=fullname+name.charAt(i);
        }
        if(fullname.equals(name)){
            System.out.println("palindrome");
        }else{System.out.println("not a palindrome");}
        sc.close();
    }
}
