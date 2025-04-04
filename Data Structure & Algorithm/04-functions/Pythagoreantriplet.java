public class Pythagoreantriplet {
    public static void main(String[] args) {
        if(isPythagoreanTriplet(20,21,29)){
            System.out.println("Yes it is a pythagorean triplet");
        }else{
            System.out.println("not a pythagorean triplet");
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c){
        int sum=(a*a)+(b*b);
        int prd=c*c;
        if(sum==prd){
            return true;
        }
        else{
            return false;
        }
    }
}
