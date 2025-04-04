public class InfiniteArraySearch {
    public static void main(String[] args) {
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }

    public static int ans(int []nums, int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums, target, start, end);
    }

    public static int binarySearch(int []nums, int target, int start, int end){
        if(nums.length==0){
            return -1;
        }
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
