import java.util.ArrayList;
import java.util.Arrays;
public class Subset{
    public static void main(String[] args) {
        int []arr={1,2,2,3};
        ArrayList<ArrayList<Integer>> ans=subsetsDuplicate(arr);
        for(ArrayList<Integer> list:ans){
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                if(i>0 && nums[i]==nums[i-1]){

                }
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static ArrayList<ArrayList<Integer>> subsetsDuplicate(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=0;
            if(i>0 && nums[i]==nums[i-1]){
                start=end+1;
            }
            end=outer.size()-1;     
            int n=outer.size();
            for(int j=start;j<n;j++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
           }
        }
        return outer;
    }
}