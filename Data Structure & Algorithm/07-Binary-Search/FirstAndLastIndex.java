
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(new int[]{firstPosition(nums, target), lastPosition(nums, target)});
    }

    public static int firstPosition(int []nums, int target){
        if(nums.length==0){
            return -1;
        }
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
    public static int lastPosition(int []nums, int target){
        if(nums.length==0){
            return -1;
        }
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}
