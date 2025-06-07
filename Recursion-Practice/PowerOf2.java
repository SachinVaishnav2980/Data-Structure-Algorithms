public class PowerOf2 {
    public static void main(String[] args) {
        int num=3;
        // if(power(num, 0))
        System.out.println(power(num, 0));
    }

    public static boolean power(int num, int x){
        if(x>num){
            return false;
        }
        if(Math.pow(2,x)==num){
            return true;
        }
        return power(num, x+1);
    }
}
