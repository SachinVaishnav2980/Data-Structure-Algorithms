import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[]arr, int low, int high){
        int i=low;
        int j=high;
        if(i<j){
            while(arr[i]<=arr[low] && i<=high-1){
            i++;
        }
            while(arr[j]>arr[low] && j>=low+1){
            j--;
        }
        if(i<j){
            swap(arr, i, j);
        }
        }
        swap(arr, low, j);
        return j;
        

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
