import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int []salary={4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        int count=0;
        for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
            count++;
        }
        return sum/count;
    }
}
