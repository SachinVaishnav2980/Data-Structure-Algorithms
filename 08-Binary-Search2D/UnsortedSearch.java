import java.util.Arrays;

public class UnsortedSearch {
    public static void main(String[] args) {
        int [][]matrix={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target=49;
        int []ans=rowcolMatrix(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int []rowcolMatrix(int [][]matrix, int target){
        if(matrix.length==0){
            return new int[]{-1,-1};
        }
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
