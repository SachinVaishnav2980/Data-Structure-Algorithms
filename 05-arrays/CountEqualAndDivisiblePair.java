

public class CountEqualAndDivisiblePair {
    public static void main(String[] args) {
        int []nums={3,1,2,2,2,1,3};
        int k=2;
        System.out.println(countPairs(nums, k));
    } 

    public static int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count(nums, nums[i], i, k, count);
        }
        return count;
    }

    public static int count(int []nums , int element, int i, int k, int count){
        for(int j=i+1;j<nums.length;j++){
                if(element==nums[j] && ((i*j)%k==0)){
                    count++;
                }
            }
            return count;
    }

}
