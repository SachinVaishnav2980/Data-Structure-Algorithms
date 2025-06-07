public class ProductOfDigit {
    public static void main(String[] args) {
        int num=12345;
        int x=10;
        int y=5;
        System.out.println(digitprod(num, 1));
        System.out.println(product(x, y));

    }   

    public static int digitprod(int num, int product){
        if(num==0){
            return product;
        }
        int digit=num%10;
        product=product*digit;
        num=num/10;
        return digitprod(num, product);
    }

    public static int product(int x, int y){
        return x*y;

    }
}



