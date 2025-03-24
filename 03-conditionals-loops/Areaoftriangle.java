import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter base:");
        float b=sc.nextFloat();
        System.out.print("Enter height:");
        float h=sc.nextFloat();
        float area=0.5f*b*h;
        System.out.println("Area of a triangle:"+area);
        sc.close();
    }
}
