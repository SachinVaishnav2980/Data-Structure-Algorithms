public class HouseRobber {

    public int rob(int[] nums) {
        int index=0;
        int ans=helper(nums, index);
        return ans;
    }

    int helper(int[]nums, int index){
        if(index>=nums.length){
            return 0;                                                 
        }

        int rob=nums[index]+helper(nums,index+2):
        int skip=helper(nums, index+1);
        int finalans=Math.max(skip, rob);
        return finalans;
    }
}
