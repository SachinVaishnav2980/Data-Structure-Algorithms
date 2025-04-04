public class MountainArray {
    public static void main(String[] args) {
        int []nums={0,2,1,0};
        int ans=mountainSearch(nums);
        System.out.println(ans);
    }

    public static int mountainSearch(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid+1]){
                return mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
