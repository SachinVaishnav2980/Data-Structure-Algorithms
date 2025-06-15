// Find Kth Bit in Nth Binary String
public class KthBitNthString {
    public static void main(String[] args) {
        findKthBit(3, 1);
    }

    public static char findKthBit(int n, int k) {
        String []s=new String[n]; 
        s[1]="0";
        for(int i=2;i<=n;i++){
            s[i]=s[i-1] + "1"  + reverse(invert(s[i-1]));
        }
    }

    public static String invert(String s){
        return ;
    }

    public static String reverse(String s){
        
    }
}