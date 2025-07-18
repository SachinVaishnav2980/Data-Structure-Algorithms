public class MaxConsecutive3 {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int maxLen=0;
        int zeros=0;
        while(right<nums.length){
            if(nums[right]==0) zeros++;
            if(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
            if(zeros<=k){   
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}