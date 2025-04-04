import java.util.Scanner;

public class Areaofeqtriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter side:");
        float s=sc.nextFloat();
        double area=0.866*s*s;
        System.out.println("Area of eq triangle:"+area);
        sc.close();
    }
}
