//sc.hasnextInt()
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int []ans=searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{firstSearch(nums, target), lastSearch(nums, target)};
    }

    public static int firstSearch(int []nums, int target){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start/2);
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return res;
    }

    public static int lastSearch(int []nums, int target){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start/2);
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return res;
    }
}
