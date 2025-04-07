public class BinarySearch {
    public static void main(String[] args) {
        int []arr={12,43,54,67,87,90};
        int target=87;
        System.out.println(binarySearchRec(arr, target, 0, arr.length-1));
    }

    public static int binarySearchRec(int []arr,int target, int s, int e){
        if(e<s){
            return -1;
        }

        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearchRec(arr, target, s, mid-1);
        }
        else{
            return binarySearchRec(arr, target, mid+1, e);
        }
    }
}
