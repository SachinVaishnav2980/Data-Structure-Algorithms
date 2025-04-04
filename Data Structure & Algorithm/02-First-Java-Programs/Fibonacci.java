import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limiting value:");
        int end=sc.nextInt();
        System.out.print("Enter the fist value:");
        int num1=sc.nextInt();
        System.out.print("Enter the second value:");
        int num2=sc.nextInt();
        System.out.print(num1+" ");
        System.out.print(num2);
        for(int i=3;i<=end;i++){
            int c=num1+num2;
            System.out.print(" "+c);
            num1=num2;
            num2=c;
        }
        sc.close();
    }
}
