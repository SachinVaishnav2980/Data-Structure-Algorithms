public class SortColors {
    public static void main(String[] args) {
        int []nums={2, 0, 2, 1, 1, 0};
    }

    // public void sortColors(int[] nums) {
    //     for(int i=1;i<nums.length;i++){
    //         int j=i-1;
    //         while(j>=0){
    //             if(nums[j]>nums[j+1]){
    //                 swap(nums,j,j+1);
    //             }
    //             j--;
    //         }
    //     }
    // }
    
    // void swap(int []nums, int first, int second){
    //     int temp=nums[first];
    //     nums[first]=nums[second];
    //     nums[second]=temp;
    // }

    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while (mid<=high) {
            if(nums[mid]==0){
                swap(nums, low, mid);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, high, mid);
                high--;
            }
        }

    }
    
    void swap(int []nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
