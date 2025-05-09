public class MazeWithObstacle {
    public static void main(String[] args) {
        String [][]board={
            {"true", "true", "true"},
            {"true", "false", "true"},
            {"true", "true", "true"}
        };
        totalWays("",board, 0, 0);
    }

    //total Ways
    public static void totalWays(String modified,String [][]maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(modified);
            return;
        }
        if(maze[r][c]=="false"){
            return ;
        }
        if(r<maze.length-1){
            totalWays(modified+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            totalWays(modified+'R',maze, r, c+1);
        }
    }
}
