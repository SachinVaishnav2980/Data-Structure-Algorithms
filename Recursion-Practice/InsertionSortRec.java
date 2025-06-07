import java.util.Arrays;

public class InsertionSortRec {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        insertionSortRec(arr,1,0);
    }

    public static void insertionSortRec(int [] arr, int index, int j){
        if(index==arr.length){
            System.out.println(Arrays.toString(arr));
            return ;
        }
        if (j>=0) {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            insertionSortRec(arr, index,j-1);
        }else{
            insertionSortRec(arr, ++index, index-1);
        }
    }
}
