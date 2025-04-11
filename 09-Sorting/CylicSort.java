import java.util.Arrays;

public class CylicSort {
    public static void main(String[] args) {
        int []arr={6,7,5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int []arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
    }

    public static void swap(int []arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    
}
