import java.util.Scanner;
public class GreetingName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of a person:");
        String name=sc.nextLine();
        System.out.println("Hello! "+name+", Welcome to the world of AI and Disaster of technology.");
        sc.close();
    }
}
