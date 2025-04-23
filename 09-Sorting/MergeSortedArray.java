import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int []nums2 = {2,5,6};
        int n = 3;
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        for(int j=0;j<nums2.length;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
