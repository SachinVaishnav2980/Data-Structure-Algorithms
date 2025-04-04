
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,9,12,14,20,33};
        int target=14;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int []nums, int target){
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
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
