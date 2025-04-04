public class SearchInMountain {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,3,1,0};
        int target=0;   
        int ans=search(nums, target);
        System.out.println(ans);
    }

    public static int search(int []arr, int target){
        int peak=mountainSearch(arr);
        int firstTry=orderAgnostic(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        else{
            return orderAgnostic(arr, target, peak+1, arr.length-1);
        }
    }

    public static int mountainSearch(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid+1]){
                return mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int orderAgnostic(int []arr, int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAsc){
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
