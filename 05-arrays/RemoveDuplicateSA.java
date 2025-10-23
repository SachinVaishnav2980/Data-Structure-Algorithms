public class RemoveDuplicateSA {

    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0){
                int j=i-1;
                recHelper(nums, j, i);
            }
        }

        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                k++;
            }else{
                break;
            }
        }
        return k;
    }

    void recHelper(int []nums, int j, int i){
        if(nums[i]!=nums[i-1]){
            break;
        }else{
            while (j<nums.length-1) {
                nums[j]=nums[j+1];
                j++;
            }
            nums[j]=-1;
            recHelper(nums, i-1, i);
        }
    }

    // 0,0,1,1,1,2,2,3,3,4
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                
            }
        }
        return ++j;
    }
}
