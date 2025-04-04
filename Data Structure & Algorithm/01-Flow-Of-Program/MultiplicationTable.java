import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Multilplication table:");
        for (int i=0; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        sc.close();
    }
}
