public class ithBit {
    public static void main(String[] args) {
        int num=110010101;
        System.out.println(ithbit(num,5));
    }

    public static int ithbit(int num, int bit){
        return num & (1<<(bit-1));
    }
}
