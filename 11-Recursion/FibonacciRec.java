public class FibonacciRec {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int specialFib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)^fib(n-2);
    }
}
