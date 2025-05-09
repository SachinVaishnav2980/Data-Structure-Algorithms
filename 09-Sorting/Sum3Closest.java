
import java.util.Arrays;


public class Sum3Closest {
    public static void main(String[] args) {
        int []arr={-1,2,1,-4};  
        System.out.println(threeSum(arr, 1));

    }

    public static int threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int closeSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int currSum=nums[i]+nums[j]+nums[k];
                if(Math.abs(currSum-target) < Math.abs(closeSum-target)){
                    closeSum=currSum;
                }
                if(currSum>target){
                    k--;
                }else if(currSum<target){
                    j++;
                }else{
                    return currSum;
                   
                }
            }
        }
        return closeSum;
    }
}
