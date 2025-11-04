import java.util.ArrayList;
import java.util.List;

public class InPlaceDuplicateRemoval {
    public static void main(String[] args) {
        
    }

    public int removeElement(int[] nums, int val) {
        int i=0;
        while (i<nums.length) {
            if(nums[i]==val){
                int temp=nums[i];
                if(i+1<nums.length){
                    for(int j=i+1;j<nums.length;j++){
                        nums[j-1]=nums[j];
                    }
                }
                nums[nums.length-1]=temp;
            }else{
                i++;
            }
        }

        int k=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==val){
                break;
            }
            k++;
        }
        return k;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Intger> inner=new ArrayList<>();
        sum(candidates, target, inner, outer, 0);
        return outer;
    }

    void sum(int []candidates, int target, List<Integer> inner, List<List<Integer>> outer, int index){
        if(index==candidates.length){
            if(target==0){
                outer.add(new ArrayList<>(inner));
                return;
            }
        }

        if(candidates[index]<=target){
            inner.add(candidates[index]);
            sum(candidates, target-candidates[index], inner, index);
            inner.remove(inner.size()-1);
        }
        sum(candidates, target, inner, index+1);

    }
}
