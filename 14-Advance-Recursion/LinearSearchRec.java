import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int []arr={2,4,6,8,8,10};
        int target=8;
        // System.out.println(search(arr, target,0));
        //for multiple occurences
        ArrayList<Integer> ans= search(arr, target, 0);
        System.out.println(ans);
    }

    // public static boolean search(int []arr, int target, int index){
    //     if(index==arr.length-1){
    //         return false;
    //     }

    //     return arr[index]==target || search(arr, target, index+1);
    // }

    // public static int search(int []arr, int target, int index){
    //     if(index==arr.length){
    //         return -1;
    //     }

    //     if(arr[index]==target){
    //         return index;
    //     }

    //     return search(arr, target, index+1);
    // }


    // passing list as argument
    // public static ArrayList<Integer> search(int []arr, int target, int index, ArrayList<Integer> list){
    //     if(index==arr.length){
    //         return list;
    //     }
    //     if(arr[index]==target){
    //         list.add(index);
    //     }

    //     return search(arr, target, index+1, list);
    // }

    //without passing list as argument
    public static ArrayList<Integer> search(int []arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowcalls=search(arr, target, index+1);
        list.addAll(ansFromBelowcalls);
        return list;
    }
}
