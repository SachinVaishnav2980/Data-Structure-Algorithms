public class FloodFill {
    public static void main(String[] args) {
        int [][]image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        floodFill(image, sr, sc, color);
        for(int []row: image){
            for(int element: row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inicolor=image[sr][sc];
        if (inicolor == color) return image;
        int [][]ans=image;
        int []delRow={-1, 0, 1, 0};
        int []delCol={0, 1, 0, -1};
        dfs(sr, sc, ans, inicolor, color, image, delRow, delCol);
        return ans;
    }

    public static void dfs(int row, int col, int[][]ans, int inicolor, int newColor, int [][] image, int []delRow, int []delCol){
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int newRow= row + delRow[i];
            int newCol= col+ delCol[i];
            if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && image[newRow][newCol]==inicolor && ans[newRow][newCol]!=newColor)
            dfs(newRow, newCol, ans, inicolor, newColor, image, delRow, delCol);
        }
    }
}
