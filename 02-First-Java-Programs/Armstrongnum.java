import java.util.Scanner;
import java.lang.Math;
public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the initial number:");
        int num1=sc.nextInt();
        System.out.print("Enter the final number:");
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        
        sc.close();
    }

    public static boolean isArmstrong(int num){
        double sum=0;
        double count=0;
        int x=num;
        int original_num=num;
        while(num>0){
            count++;
            num=num/10;
        }
        while(x>0){
            double digit=x%10;
            sum=sum+Math.pow(digit,count);
            x=x/10;
        }
        return sum==original_num;
    }
}
