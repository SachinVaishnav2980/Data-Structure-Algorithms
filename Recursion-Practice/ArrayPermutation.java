import java.util.ArrayList;
import java.util.Arrays;


public class ArrayPermutation {
    public static void main(String[] args) {
        int []arr={1,2,3};
        boolean []freq=new boolean[arr.length];
        // permutation(arr, new ArrayList<>(), freq);
        permutation2(arr, 0);

    }

    // public static void permutation(int []arr, ArrayList<Integer> list, boolean []freq){
    //     if(list.size()==arr.length){
    //         System.out.println(list);
    //         return;
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         if(!freq[i]){
    //             freq[i]=true;
    //             list.add(arr[i]);
    //             permutation(arr, list, freq);
    //             list.remove(list.size()-1);
    //             freq[i]=false;
    //         }
    //     }
    // }

    public static void permutation2(int []arr, int index){
        if(index==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr, i, index);
            permutation2(arr, index+1);
            swap(arr, i, index);
        }
    }

    public static void swap(int []arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
