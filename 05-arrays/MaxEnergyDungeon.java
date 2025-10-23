public class MaxEnergyDungeon {

    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        for(int i=k;i<n;i++){
            energy[i]=Math.max(energy[i], energy[k-i]+energy[i]);
        }

        int maximumEnergy=Integer.MIN_VALUE;
        for(int i=n-1;i>n-k-1;i--){
            maximumEnergy=Math.max(maximumEnergy, energy[i]);
        }
        return maximumEnergy;
    }

    //abcb
    public boolean scoreBalance(String s) {
        int n=s.length();
        int totalScore=0;
        for(int i=0;i<n;i++){
            totalScore+=s.charAt(i)-96;
        }       

        int left=0;
        for(int i=0;i<n;i++){
            left+=s.charAt(i)-96;
            int right=totalScore-left;
            if(left==right){
                return true;
            }
        }
        return false;
    }

    // nums = [5,2,7,9,16]

    public int longestSubarray(int[] nums) {
        if(nums.length==1 || nums.length==2){
            return nums.length;
        }

        int maxLen=2;
        int currLen=2;

        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1]+nums[i-2]){
                currLen++;
            }else{
                currLen=2;
            }
            maxLen=Math.max(maxLen, currLen);
        }
        return maxLen;
    }

}
