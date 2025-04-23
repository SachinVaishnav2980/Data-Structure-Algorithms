import java.util.Scanner;

public class practice {
    public int maxFrequency(int[] nums, int k) {
        

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        int []arr=new int[5];
        for(int element: arr){
            element=scan.nextInt();
        }
        int k=scan.nextInt();
        scan.close();
        System.out.println(maxFrequency(arr,k));

    }
    
}
