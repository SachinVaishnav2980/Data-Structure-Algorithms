

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int []arr={1,3,5,6,9,12,14,20,33};
        int []arr={111,93,55,46,39,20,14,-2,-3};
        int target=46;
        System.out.println(orderAgnostic(arr, target));
    }

    public static int orderAgnostic(int []arr, int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
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
