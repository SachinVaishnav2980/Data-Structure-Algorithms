

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={-1,0,3,5,9,12};
        int target=11;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static int binarySearch(int []arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]>target){
            return binarySearch(arr, target, start, mid-1);
        }
        if(arr[mid]<target){
            return binarySearch(arr, target, mid+1, end);
        }else{
            return mid;
        }
    }
}
