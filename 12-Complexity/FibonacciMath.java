

public class FibonacciMath {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static long fib(int n){
        if(n<=1){
            return n;
        }
        return (long)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
    }
}
