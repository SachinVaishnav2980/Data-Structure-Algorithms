public class FirstMissingPositive {
    public static void main(String[] args) {
        int []nums={3,4,-1,1};
        int ans=firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int []nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return nums.length + 1;
    }

    public static void swap(int []nums, int first, int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}
