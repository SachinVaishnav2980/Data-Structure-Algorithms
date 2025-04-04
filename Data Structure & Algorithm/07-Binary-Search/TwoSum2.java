import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int []numbers = {2,7,11,15};
        int target = 26;
        int []ans=twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
        
    //Linear search approach O(n**2) time complexity.
    // public static int[] twoSum(int[] numbers, int target) {
    //     if(numbers.length==0){
    //         return new int[]{-1,-1};
    //     }
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i+1;j<numbers.length;j++){
    //             if(numbers[i]+numbers[j]==target){
    //                 return new int[]{i+1,j+1};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    //Binary search approch.
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(numbers[start]+numbers[mid]==target){
                return new int[]{start+1,mid+1};
            }
            else if(numbers[start]+numbers[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }


}
