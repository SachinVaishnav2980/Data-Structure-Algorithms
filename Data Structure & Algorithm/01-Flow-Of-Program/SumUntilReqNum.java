import java.util.Scanner;
public class SumUntilReqNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("choice:");
        int choice=sc.nextInt();
        int num=0;
        int sum=0;
        while(num!=choice){
            System.out.print("Enter the number:");
            num=sc.nextInt();
            sum=sum+num;
        }
        System.out.println("Sum till limiting num is:"+sum);
        sc.close();

    }
}
