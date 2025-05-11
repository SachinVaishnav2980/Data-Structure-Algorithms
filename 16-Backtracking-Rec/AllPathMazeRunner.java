public class AllPathMazeRunner {
    public static void main(String[] args) {
        boolean [][]board={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        totalWays("",board, 0, 0);
    }

    //total Ways
    public static void totalWays(String modified,boolean [][]maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(modified);
            return;
        }
        if(!maze[r][c]){
            return ;
        }
        //Every time i visit make it false or already visited for one function call
        maze[r][c]=false;

        if(r>0){
            totalWays(modified+'U',maze, r-1, c);
        }
        if(c>0){
            totalWays(modified+'L',maze, r, c-1);
        }
        if(r<maze.length-1){
            totalWays(modified+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            totalWays(modified+'R',maze, r, c+1);
        }

        //And when i'm backtracking or going back from recursive calls
        //i'll make it true or unvisited for other recursive calls
        maze[r][c]=true;
    }

}
