public class LinearSearchRec {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10};
        int target=8;
        System.out.println(search(arr, target,0));
    }

    // public static boolean search(int []arr, int target, int index){
    //     if(index==arr.length-1){
    //         return false;
    //     }

    //     return arr[index]==target || search(arr, target, index+1);
    // }

    public static int search(int []arr, int target, int index){
        if(index==arr.length-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return search(arr, target, index+1);
    }
}
