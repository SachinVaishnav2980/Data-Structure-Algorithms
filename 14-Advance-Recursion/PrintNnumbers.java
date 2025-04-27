

public class PrintNnumbers {
    public static void main(String[] args) {
        increasingPrint(5);
        decreasingPrint(5);
    }

    public static void increasingPrint(int n){
        if(n==0){
            return;
        }
        increasingPrint(n-1);
        System.out.println(n);
    }

    public static void decreasingPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingPrint(n-1);
    }
}
