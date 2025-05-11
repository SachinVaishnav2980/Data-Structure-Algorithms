import java.util.Arrays;

public class StepsMazeRunner {
    public static void main(String[] args) {
        boolean [][]board={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int [][]path=new int[board.length][board[0].length];
        totalWays("",board, 0, 0,path,1);
    }

    //total Ways
    public static void totalWays(String modified, boolean [][]maze, int r, int c, int [][]path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int []arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(modified);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return ;
        }
        //Every time i visit make it false or already visited for one function call
        maze[r][c]=false;
        path[r][c]=step;

        if(r>0){
            totalWays(modified+'U', maze, r-1, c, path, step+1);
        }
        if(c>0){
            totalWays(modified+'L',maze, r, c-1, path, step+1);
        }
        if(r<maze.length-1){
            totalWays(modified+'D',maze, r+1, c,path, step+1);
        }
        if(c<maze[0].length-1){
            totalWays(modified+'R',maze, r, c+1, path, step+1);
        }

        //And when i'm backtracking or going back from recursive calls
        //i'll make it true or unvisited for other recursive calls
        maze[r][c]=true;
        path[r][c]=0;
    }
}
