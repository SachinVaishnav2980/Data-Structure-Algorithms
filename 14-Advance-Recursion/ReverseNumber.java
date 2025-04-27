

public class ReverseNumber {
    static int ans=0;
    public static int reverseNumber(int n){
        if(n==0){
            return ans;
        }
        ans=ans*10+n%10;
        return reverseNumber(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(4281));
    }
}
