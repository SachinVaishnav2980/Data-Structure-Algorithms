import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={
            {22,43,56},
            {12,67},
            {86,99,102,45,65}
        };
        int target=12;
        int []ans=searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchIn2DArray(int [][]arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
