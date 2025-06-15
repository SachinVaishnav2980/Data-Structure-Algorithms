import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {
    public static void main(String[] args) {
        int []arr={5, 6, 7};
        System.out.println(subsetSums(arr));

    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        subsetWithSum(arr, 0, 0, list);
        Collections.sort(list);
        return list;
    }

    public static void subsetWithSum(int []arr, int sum, int index, ArrayList<Integer> list){
        if(index==arr.length){
            list.add(sum);
            return;
        }

        sum+=arr[index];
        subsetWithSum(arr, sum, index+1, list);
        sum-=arr[index];
        subsetWithSum(arr, sum, index+1, list);
    }
}
