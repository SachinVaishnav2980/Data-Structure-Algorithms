import java.util.Arrays;
public class MedianSortedArray {
    public static void main(String[] args) {
        int []nums1={1,2};
        int []nums2={3,4};
        double res=findMedianSortedArrays(nums1, nums2);
        System.out.printf("%.5f",res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []ans=sorted(nums1, nums2);
        int start=0;
        int end=ans.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((ans.length & 1)==1){
                return ans[mid];
            }else{
                return (double)(ans[mid]+ans[mid+1])/2;
            }
        }
        return -1;
    }

    public static int[] sorted(int []nums1, int []nums2){
        int m=nums1.length;
        int n=nums2.length;
        int ans[]=new int[m+n];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        int i=m;
        for(int j=0;j<nums2.length;j++){
            ans[i]=nums2[j];
            i++;
        }
        Arrays.sort(ans);
        return ans;
        
    }
}
