import java.util.Arrays;

public class MinAbsoluteSum {
    public static void main(String[] args) {
        int []nums1={1,10,4,4,2,7};
        int []nums2={9,3,5,1,7,4};
        int ans=minAbsoluteSumDiff(nums1,nums2);
        System.out.println(ans);
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int []temp=nums1.clone();
        Arrays.sort(temp);
        int sum=0;
        for(int i=0;i<nums1.length;i++){
            sum+=Math.abs(nums1[i]-nums2[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int index=nearestAns(temp,nums2[i]);
            int ans=Math.min(sum-Math.abs((nums1[i]-nums2[i])));
        }
    }

    public static int nearestAns(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
