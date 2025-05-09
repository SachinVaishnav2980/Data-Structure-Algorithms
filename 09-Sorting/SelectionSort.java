import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []nums={4,5,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void selectionSort(int []nums){
        for(int i=0;i<nums.length;i++){
            int last=nums.length-i-1;
            int max=maxIndex(nums,0,last);
            swap(nums,max,last);
        }
    }

    public static void swap(int []nums, int first, int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }

    public static int maxIndex(int []nums, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
}
