import java.util.Arrays;

public class FloodFillColor {
    public static void main(String[] args) {
        int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        floodFill(image, sr, sc, color);
        for(int []row: image){
            for(int element: row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int incolor=image[sr][sc];
        if(incolor==color) return image;
        int [][]ans=image;
        int []delRow={-1, 0, 1, 0};
        int []delCol={0, 1, 0, -1};
        colorConverter(image, sr, sc, color, incolor, delRow, delCol, ans);
        return ans;
    }

    public static void colorConverter(int[][] image, int row, int col, int color, int incolor, int []delRow, int []delCol, int [][]ans){
        ans[row][col]=color;
        for(int i=0;i<4;i++){
            int newRow= row + delRow[i];
            int newCol=col + delCol[i];
            if(newRow>=0 && newRow<image.length && newCol>=0 && newCol<image[0].length && image[newRow][newCol]==incolor && ans[newRow][newCol]!=color){
                colorConverter(image, newRow, newCol, color, incolor, delRow, delCol, ans);
            }
        }
    }
}
