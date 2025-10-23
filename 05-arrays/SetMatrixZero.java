import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {
        
    }

    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m =matrix[0].length;

        int col0=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //mark the i-th row
                    matrix[i][0]=0;
                    //mark the j-th col
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }

    //SC:0(n)
    // public void setZeroes(int[][] matrix) {
    //     List<List<Integer>> list=new ArrayList<>();
    //     int n=matrix.length;
    //     int m=matrix[0].length;

    //     boolean row[]=new boolean[n];
    //     boolean col[]=new boolean[m];

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j]==0){
    //                 row[i]=true;
    //                 col[j]=true;
    //             }
    //         }
    //     }
        
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(row[i] || col[j]){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    // }
}
