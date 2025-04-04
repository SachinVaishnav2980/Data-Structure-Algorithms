import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDisappearedNumbers(nums);
        System.out.println(ans);    
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[i]!=nums[current]){
                swap(nums,i,current);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                ans.add(index+1);
            }
        }
        return ans;
    }


    public static void swap(int []nums, int first, int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}
