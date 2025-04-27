

public class SumNto1 {
    public static void main(String[] args) {
        System.out.println(sumDesc(5));
    }

    public static int sumDesc(int n){
        if(n==0){
            return 0;
        }
        return n+sumDesc(n-1);
    }
}
