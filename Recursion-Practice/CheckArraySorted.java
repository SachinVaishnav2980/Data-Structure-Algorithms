//This code will check that given array is sorted or not.
public class CheckArraySorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(checkSort(arr, 0));
    }

    public static boolean checkSort(int []arr, int index){
        if(arr.length==0){
            return false;
        }
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && checkSort(arr, index+1);
    }
}
