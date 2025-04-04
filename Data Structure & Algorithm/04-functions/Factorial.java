
public class Factorial {
    public static void main(String[] args) {
       int ans= fact(6);
       System.out.println("Factorial is:"+ans);
    }

    public static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}
