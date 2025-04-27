public class PalindromeNum {
    static int ans=0;
    public static int reverseNumber(int n){
        if(n==0){
            return ans;
        }
        ans=ans*10+n%10;
        return reverseNumber(n/10);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int n){
        int revNum=reverseNumber(n);
        if(revNum==n){
            return true;
        }
        return false;
    }
}
