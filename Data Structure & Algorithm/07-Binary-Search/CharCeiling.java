public class CharCeiling {
    public static void main(String[] args) {
        char arr[]={'c','f','j'};
        char target='c';
        char ans=charCeilingSearch(arr, target);
        System.out.println(ans);
    }
    public static char charCeilingSearch(char []nums, char target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return nums[start%nums.length];
    }
}
