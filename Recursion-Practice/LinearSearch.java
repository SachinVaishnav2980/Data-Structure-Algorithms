public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=6;
        System.out.println(search(arr, 0, target));
    }

    public static boolean search(int []arr, int index, int target){
        if(index == arr.length){
            return true;
        }
        return arr[index]==target || search(arr, index+1, target);
    }
}
