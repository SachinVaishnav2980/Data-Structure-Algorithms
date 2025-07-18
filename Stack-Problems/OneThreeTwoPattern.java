import java.util.ArrayList;
import java.util.List;
public class OneThreeTwoPattern {
    public static void main(String[] args) {
        int []nums = {-1,3,2,0};
        find132pattern(nums);
        // System.out.println(find132pattern(nums));
    }
    public static void find132pattern(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean []freq=new boolean[nums.length];
        permutation(nums, new ArrayList<>(), ans, freq);
        for(List<Integer> element: ans){
            for(int i=0;i<element.size();i++){
                
            }
        }
    }

    public static void permutation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean []freq){
        if(ds.size()==nums.length){
            ans.add(ds);
            return ;
        }

         for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                permutation(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}

