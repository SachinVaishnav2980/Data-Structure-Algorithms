import java.util.Arrays;

public class NumberSmallerThanNumber {
    public static void main(String[] args) {
        int []nums={8,1,2,2,3};
        int []ans=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    if(nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
