import java.util.Arrays;
public class CheckNandDoubleExist {
    public static void main(String[] args) {
        int [] arr={-2,0,10,-19,4,6,-8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(checkIfExist(arr));
    }

    // public static boolean checkIfExist(int[] arr) {
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==2*arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // } 

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
