public class SingleOccurence {
    public static void main(String[] args) {
        int []nums={2,3,4,1,2,1,3,6,4};
        System.out.println(Singleoccurence(nums));
    }

    public static int Singleoccurence(int []nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count<1){
                return nums[i];
            }
        }
        return -1;
    }
}
