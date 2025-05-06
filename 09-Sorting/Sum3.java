import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Sum3 {
    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};  
        //sorted array : [-4,-1,-1,0,1,2,4]
        List<List<Integer>> result = threeSum(arr);
        for (List<Integer> row : result) {
            System.out.println(row);
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> matrix = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            addElements(nums, i, j, k, matrix);
        }
        return matrix;
    }

    public static void addElements(int []nums,int i,int j, int k, List<List<Integer>> matrix){
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum>0){
                k--;
            }else if(sum<0){
                j++;
            }else{
                matrix.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
               
            }
        }
    }
}
