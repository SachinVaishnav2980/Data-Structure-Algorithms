import java.util.Arrays;

public class Brainpower {
    public static void main(String[] args) {
        int [][]nums={
            {3,22},
            {4,3},
            {4,4},
            {2,5}
        };
        int ans[]=maxPoints(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] maxPoints(int [][]nums){
        int sum=0;
        int j=0;
        int i;
        for(i=0;i<nums.length;i++){
            sum=sum+nums[i][0];
            i=i+nums[i][1];
            j=i;
        }
        return new int[]{i,j};
    }

}
