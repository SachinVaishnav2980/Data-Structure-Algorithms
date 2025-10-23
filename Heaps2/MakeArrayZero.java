package Heaps2;

import java.util.*;

public class MakeArrayZero {

    // public int minimumOperations(int[] nums) {
    // int op=0;
    // if(check(nums)){
    // return 0;
    // }

    // for(int i=0;i<nums.length;i++){
    // int min=findMin(nums);
    // for(int j=0;j<nums.length;j++){
    // if(nums[j]!=0){
    // nums[j]-=min;
    // }
    // }
    // op++;
    // if(check(nums)){
    // return op;
    // }
    // }
    // return op;
    // }

    // boolean check(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == 0) {
    //             continue;
    //         } else {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // int findMin(int []nums){
    // int min=Integer.MAX_VALUE;
    // for(int i=0;i<nums.length;i++){
    // if(nums[i]!=0 && nums[i]<min){
    // min=nums[i];
    // }
    // }
    // return min;
    // }

    // optimized approach
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int element:nums){
            if(element>0){
                set.add(element);
            }
        }
        return set.size();
    }
}
