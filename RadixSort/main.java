import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int []arr={29, 83, 471, 36, 91, 8};
        // int placeDigit=0;
        // while(max>0){
        //     placeDigit++;
        //     max=max/10;
        // }
        // int maximum=Arrays.stream(arr).max().getAsInt();
        // radixSort(arr, max);
        System.out.println("orignal array:"+Arrays.toString(arr));
        radixSort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));
    }

    public static void radixSort(int []arr){
        int max=Arrays.stream(arr).max().getAsInt();
        for(int exp=1;(max/exp)>0;exp*=10){
            countSort(arr, exp);
        }
    }

    public static void countSort(int []arr, int exp){
        int n=arr.length;
        int []output=new int [n];
        int []count=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        System.out.println("Count array for "+exp+":"+Arrays.toString(count));

        for(int i=1;i<10;i++){
            count[i]=count[i]+count[i-1];
        }

        System.out.println("updated count array "+":"+Arrays.toString(count));
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}
