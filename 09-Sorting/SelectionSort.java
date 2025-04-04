import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []nums={4,5,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=maxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static void swap(int []arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
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
