
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int []arr, int low, int high){
        if(low==high){
            return ;
        }
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int []arr, int low, int mid, int high){
        int []temp=new int [high-low+1];
        int left=low;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
            }else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        for(int j=0;j<temp.length;j++){
            arr[low+j]=temp[j];
        }
    }   

}
