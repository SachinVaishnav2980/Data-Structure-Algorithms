import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int []heights={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] nums) {
        int ans[]=nums.clone();
        Arrays.sort(ans);
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=nums[i]){
                count=count+1;
            }
        }
        return count;
    } 
}
