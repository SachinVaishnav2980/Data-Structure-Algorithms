import java.util.List;

public class AdjacentIncreasingSubArray {
    public static void main(String[] args) {
        
    }

    // nums = [2,5,7,8,9,2,3,4,3,1], k = 3
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int min=k-1;
        if(min==0) return true;
        for(int j=k+1;j<nums.size();j++){
            if(nums.get(j)>nums.get(j-1) && nums.get(j-k) > nums.get(j-k-1)){
                min--;
            }else{
                min=k-1;
            }
            if(min==0) return true;
        }
        return false;
    }


    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int maxSize=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(!check(nums, i, j)){
                    break;
                }else{
                    int k=j-i+1;
                    if(i+k<n && j+k<n && check(nums, i+k, j+k)){
                        maxSize=Math.max(maxSize, k);
                    }
                }
            }
        }
        return maxSize;
    }

    boolean check(List<Integer> nums, int first, int last){
        for(int i=first;i<last;i++){
            if(nums.get(i)!=nums.get(i+1)-1){
                return false;
            }
        }
        return true;
    }
}

