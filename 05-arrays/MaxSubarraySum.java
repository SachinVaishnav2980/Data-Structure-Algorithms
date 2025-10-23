public class MaxSubarraySum {

    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
    }

    public int maxSubArray(int[] nums) {
        int i=0;
        int j=i+1;
        int sum=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        while (i<n && j<n) {
            if(nums[i]+nums[j]<=0){
                i++;
                j=i+1;
            }else{
                sum+=nums[j];
                j++;
            }
        }
        return sum;
    }
}
