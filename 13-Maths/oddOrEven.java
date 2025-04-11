public class oddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(67));
        System.out.println(oddOrEven(67));
    }

    public static boolean oddOrEven(int num){
        return (num & 1)==1;
    }
}
