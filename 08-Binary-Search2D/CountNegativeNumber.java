public class CountNegativeNumber {
    public static void main(String[] args) {
        int [][]grid={
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
    };
    int ans=countNegatives(grid);
    System.out.println(ans);
    }

    // public static int countNegatives(int [][]grid){
    //     if(grid.length==0){
    //         return -1;
    //     }
    //     int count=0;
    //     for(int row=0;row<grid.length;row++){
    //         count=colSearch(grid,row,count);
    //     }
    //     return count;
    // }

    // public static int colSearch(int[][]grid,int row,int count){
    //     for(int col=0;col<grid[0].length;col++){
    //         if(grid[row][col]<0){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public static int countNegatives(int [][]grid){
        int count=0;
        int row=0;
        int col=grid[0].length-1;
        while(col>=0 && row<grid.length){
            if(grid[row][col]<0){
                count += grid.length-row;
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
}
