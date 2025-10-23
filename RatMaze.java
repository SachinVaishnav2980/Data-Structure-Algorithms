import java.util.ArrayList;

public class RatMaze {


    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        int m=maze[0].length;
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        boolean[][]visited=new boolean[n][m];
        int [][]dir={
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
        };

        Char [] dirchar={'U','R','D','L'};

        isFinder(maze, visited, n, m, 0, 0, ans, str, dir, dirchar);
        return ans;
    }

    void isFinder(int [][]maze, boolean[][] visited, int n, int m, int row, int col, ArrayList<String> ans, StringBuilder str, int [][]dir, Char [] dirchar){
        if(row==n-1 && col==m-1){
            ans.add(str.toString());
            return ;
        }

        visited[row][col]=true;

        for(int i=0;i<dir.length;i++){
            int nrow=row+dir[i][0];
            int ncol=col+dir[i][1];

            if(isValid(nrow, ncol, n, m) && !visited[nrow][ncol] && maze[nrow][ncol]==1){
                str.append(dirchar[i]);
                isFinder(maze, visited, n, m, nrow, ncol, ans, str, dir, dirchar);
                str.deleteCharAt(str.length()-1);
            }   
        }
            visited[row][col]=false;
    }

    boolean isValid(int i, int j, int n, int m){
        return i>=0 && j>=0 && i<n && j<m;
    }

}
