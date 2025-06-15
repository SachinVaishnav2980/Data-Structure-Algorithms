import java.util.ArrayList;
import java.util.Arrays;


public class MoveZerosToEnd {
    public static void main(String[] args) {
        int []nums={0,1,0,3,12}; //1 0 0 3 12  
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    // public static void moveZeroes(int[] nums) {
    //     if(nums.length==1){
    //         System.out.println(Arrays.toString(nums));
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums.length-1;j++){
    //             if(nums[j]==0){
    //                 swap(nums, j, j+1);
    //             }
    //         }
    //     }
    // }

    // public static void swap(int []nums, int first, int second){
    //     int temp=nums[first];
    //     nums[first]=nums[second];
    //     nums[second]=temp;
    // }

    public static void moveZeroes(int[] nums){
        int initial=0;
        for(int element: nums){
            if(element!=0){
                nums[initial]=element;
                 initial++;
            }
        }

        while (initial<nums.length) {
            nums[initial]=0;
            initial++;
        }
    }   
}
