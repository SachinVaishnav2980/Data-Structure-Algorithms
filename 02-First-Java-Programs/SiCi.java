import java.util.Scanner;
import java.lang.Math;
public class SiCi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal value:");
        double p=sc.nextDouble();
        System.out.print("Enter the value of time:");
        double t=sc.nextDouble();
        System.out.print("Enter the rate:");
        double r=sc.nextDouble();
        double si=(p*r*t)/100;
        System.out.println("Simple Interest is:"+si);
        double x=1+r/100;
        double a=p*(Math.pow(x,t));
        double ci=a-p;
        System.out.println("Compound Interest is:"+ci);
        sc.close();
    }
}
