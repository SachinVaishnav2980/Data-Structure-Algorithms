import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={4,5,6,3,2,7,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
            // int j=i-1;
            // while(j>=0){
            //     if(arr[j]>arr[j+1]){
            //         swap(arr,j,j+1);
            //     }
            //     j--;
            // }
        }
    }

    public static void swap(int []arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    
}
