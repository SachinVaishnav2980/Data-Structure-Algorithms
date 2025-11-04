import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Countsort {
    public static void main(String[] args) {
        int []arr={3,4,1,3,2,5,2,8};
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        // countSort(arr, max);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int []arr, int max){
        if(arr==null || arr.length<=1){
            return ;
        }
        int []freq=new int[max+1];

        for(int element:arr){
            freq[element]++;
        }

        int index=0;
        for(int i=0;i<max;i++){
            while (freq[i]>0) {
                arr[index]=i;
                index++;
                freq[i]--;
            }
        }
    }

    public static void countSortHash(int []arr, int max, int min){
        Map<Integer, Integer> countMap=new HashMap<>();
        for(int element:arr){
            countMap.put(element, countMap.getOrDefault(element, 0)+1);
        }

        int index=0;
        for(int i=min;i<=max;i++){
            int count=countMap.getOrDefault(i, 0);
            for(int j=0;j<count;j++){
                arr[index]=i;
                index++;
            }
        }
    }
    
}
