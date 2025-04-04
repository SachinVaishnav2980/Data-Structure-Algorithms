import java.util.Arrays;

public class SortedSearch {
    public static void main(String[] args) {
        int [][]arr={
            {1 , 2 , 3 , 4 },
            {5 , 6 , 7 , 8 },
            {9, 10, 11, 12 },
            {13, 14, 15,16 }
        };
        int target=11;
        int []ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int []binarySearch(int [][]matrix, int rstart, int cstart, int cend, int target){
        while(cstart<=cend){
            int cmid=cstart+(cend-cstart)/2;
            if(matrix[rstart][cmid]==target){
                return new int[]{rstart,cmid};
            }
            else if(matrix[rstart][cmid]<target){
                cstart=cmid+1;
            }else{
                cend=cmid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int [][]matrix , int target){
        int rows=matrix.length;
        int col=matrix[0].length;
        if(col==0){
            return new int[]{-1,-1};
        }

        if(rows==1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rstart=0;
        int rend=rows-1;
        int cmid=col/2;
        while(rstart<(rend-1)){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if(matrix[mid][cmid]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }

        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        
        
        // 1st half
        if(target<=matrix[rstart][cmid-1]){
            return binarySearch(matrix, rstart, 0, cmid-1, target);
        }
        // 2nd half
        if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][col-1]){
            return binarySearch(matrix, rstart, cmid+1, col-1, target);
        }
        // 3rd half
        if(target<=matrix[rstart+1][cmid-1]){
            return binarySearch(matrix, rstart+1, 0, cmid-1, target);
        }
        // 4th half
        else{
            return binarySearch(matrix, rstart+1, cmid+1, col-1, target);
        }
    }
}
