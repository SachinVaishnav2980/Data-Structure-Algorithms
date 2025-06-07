import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSortRec(arr, 0, arr.length - 1);
    }

    public static void bubbleSortRec(int[] arr, int index, int j) {
        if (j == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (index<j) {
            if (arr[index] > arr[index+1]) {
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
                bubbleSortRec(arr, index+1, j);
        }else{
            bubbleSortRec(arr, 0, j-1);
        }
    }
}
