public class Palindromenum {
    public static void main(String[] args) {
        if(isPalindrome(98789)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        int digit=0;
        int rev=0;
        int n=num;
        while (num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        } 
        System.out.println(rev);
        if(rev==n){
            return true;
        }
        else{
            return false;
        }
    }
}
