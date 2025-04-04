// ceiling is a smallest number which is either equals to target or just greater than the target...

public class Ceiling {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,9,12,14,20,33};
        int target=34;
        int ans=ceilingSearch(arr, target);
        System.out.println(ans);
    }
    public static int ceilingSearch(int []nums, int target){
        if(nums.length==0){
            return -1;
        }
        if(target>nums.length-1){
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
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
