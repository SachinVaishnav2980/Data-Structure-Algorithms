import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2};
        int target=4;
        System.out.println(ans(arr, target));
    }

    public static ArrayList<ArrayList<Integer>>  ans(int []arr, int target){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        combinationSum(0, arr, target, new ArrayList<>(), ans);
        return ans;
    }

    public static void combinationSum(int index, int []arr, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            list.add(arr[i]);
            combinationSum(i+1, arr, target-arr[i], list, ans);
            list.remove(list.size()-1);
        }
    }
}
