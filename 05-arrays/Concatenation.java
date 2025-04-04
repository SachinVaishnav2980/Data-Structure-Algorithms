

import java.util.ArrayList;
public class Concatenation {
    public static void main(String[] args) {
        // int []nums={1,2,1};
        // ArrayList<Integer> ans=new ArrayList <Integer>() ;
        // for(int i=0;i<nums.length;i++){
        //     ans.add(nums[i]);
            
        // }
        // for(int i=0;i<nums.length;i++){
        //     ans.add(nums[i]);
        //  }
        // System.out.println(ans);

    }
    public static Object[] getConcatenation(int[] nums) {
        // int []ans=new int[2*nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=nums[i];
        //     ans[i+nums.length]=nums[i];
        // }
        // return ans;

        ArrayList<Integer> ans=new ArrayList <Integer>() ;
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
         }
        // Object[]ans1=ans.toArray();
        return ans.toArray();
    }
}
