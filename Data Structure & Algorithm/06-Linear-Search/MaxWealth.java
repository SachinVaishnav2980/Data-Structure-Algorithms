
public class MaxWealth {
    public static void main(String[] args) {
        int [][]arr={
            {1,5},
            {7,3},
            {3,5}
        };
        int ans=wealth(arr);
        System.out.println(ans);

    }
    public static int wealth(int [][]nums){
        int ans=Integer.MIN_VALUE;
        for(int row=0;row<nums.length;row++){
            int sum=0;
            for(int col=0;col<nums[row].length;col++){
                sum=sum+nums[row][col];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
