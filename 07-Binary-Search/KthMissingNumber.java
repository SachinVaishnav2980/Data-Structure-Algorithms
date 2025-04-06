

public class KthMissingNumber {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int pos=2;
        int ans=findKthPositive(arr, pos);
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int missing=arr[mid]-(mid+1);
            if(arr[mid]<missing){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start+k;
    }
}
