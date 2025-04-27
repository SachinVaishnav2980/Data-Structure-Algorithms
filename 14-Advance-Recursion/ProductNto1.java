

public class ProductNto1 {
    public static void main(String[] args) {
        System.out.println(ProductDesc(5));
    }

    public static int ProductDesc(int n){
        if(n==0){
            return 1;
        }

        return n*ProductDesc(n-1);
    }
}
