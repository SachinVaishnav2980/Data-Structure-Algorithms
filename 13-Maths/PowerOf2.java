public class PowerOf2 {
    public static void main(String[] args) {
        int num=31;
        System.out.println(power(num));

    }
    public static boolean power(int num){
        return (num & (num-1))==0;
    }
}
