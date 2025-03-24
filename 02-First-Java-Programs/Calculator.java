import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("num1:");
        int num1=sc.nextInt();
        System.out.print("num2:");
        int num2=sc.nextInt();
        System.out.print("Enter the operator:");
        char op=sc.next().charAt(0);
        if(op =='+'){
            int sum=num1+num2;
            System.out.println("Sum is: "+sum);
        }
        else if(op=='-'){
            int diff=num1-num2;
            System.out.println("Difference is: "+diff);
        }
        else if(op=='*'){
            int mul=num1*num2;
            System.out.println("Multiplication is: "+mul);
        }
        else if(op=='/'){
            int div=num1/num2;
            System.out.println("Division is: "+div);
        }
        else if(op=='%'){
            int mod =num1%num2;
            System.out.println("Remainder is: "+mod);
        }
        else{
            System.out.println("Invalid operator...");
        }
        sc.close();
    }
}
