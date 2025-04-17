public class uniqueElement {
    public static void main(String[] args) {
        int []arr={1,1,2,3,3,4,4,8,8};
        int ans=Singleoccurence(arr);
        System.out.println(ans);
    }

    public static int Singleoccurence(int []nums){
        if(nums.length==0){
            return -1;
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
               return nums[mid];
            }else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
