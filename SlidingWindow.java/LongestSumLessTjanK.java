//Length of max subarray having sum<=k
public class LongestSumLessTjanK {
    public static void main(String[] args) {
        int []arr={2,5,1,7,10};
        int k=14;
        System.out.println(LongestSubarray(arr, k));
    }

    public static int LongestSubarray(int []arr, int k){
        int left=0;
        int right=0;
        int sum=0;
        int maxLength=0;
        while (right<arr.length) {
           sum+=arr[right];
           if(sum>k){
            sum-=arr[left];
            left++;
           }
           if(sum<=k){
            maxLength=Math.max(maxLength, right-left+1);
           }
           right++;
        }
        return maxLength;
    }
}
