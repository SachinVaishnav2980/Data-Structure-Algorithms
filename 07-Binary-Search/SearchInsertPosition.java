public class SearchInsertPosition {
    public static void main(String[] args) {
        int []nums={1,3,5,6};
        int ans=searchInsert(nums, 2);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end+1;
    }
}
