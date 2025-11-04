import java.util.Scanner;

public class PizzaTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long m=sc.nextLong();
            long hao=m/3;
            if(m%3==2){
                hao++;
            }
            System.out.println(hao);
        }
        sc.close();
    }
}
