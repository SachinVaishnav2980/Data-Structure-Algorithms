public class SearchInRotatedArray {
    public static void main(String[] args) {
        int []nums={3,4,5,6,7,0,1,2};
        int target=1;
        int ans=search(nums, target);
        System.out.println(ans);
    }

    public static int search(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                 end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
