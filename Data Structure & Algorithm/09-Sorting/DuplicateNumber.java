public class DuplicateNumber {
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        int ans=duplicate(nums);
        System.out.println(ans);
    }

    // public static int duplicate(int []nums){
    //     int i=0;
    //     while(i<nums.length){
    //         int current=nums[i]-1;
    //         if( nums[i]>=0 && nums[i]<nums.length &&nums[i]!=nums[current]){
    //             swap(nums,i,current);
    //         }else{
    //             i++;
    //         }
    //     }
    //     return nums[nums.length-1];
    // }
    // public static void swap(int []arr, int first, int last){
    //     int temp=arr[first];
    //     arr[first]=arr[last];
    //     arr[last]=temp;
    // }

    public static int duplicate(int []nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int current=nums[i]-1;
                if(nums[i]!=nums[current]){
                    swap(nums, i, current);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
        
    }
    public static void swap(int []arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
