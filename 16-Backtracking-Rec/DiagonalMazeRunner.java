public class DiagonalMazeRunner {
    public static void main(String[] args) {
        System.out.println(totalPath( 3, 3));
        totalWays("",3, 3);
    }

    //Total path
    public static int totalPath(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left=totalPath(r-1, c);
        int middle=totalPath(r-1, c-1);
        int right=totalPath(r, c-1);
        return left+middle+right;
    }

    //total Ways
    public static void totalWays(String modified, int r, int c){
        if(r==1 && c==1){
            System.out.println(modified);
            return;
        }
        if(r>1 && c>1){
            totalWays(modified+'D',r-1, c-1);
        }
        if(r>1){
            totalWays(modified+'D', r-1, c);
        }
        if(c>1){
            totalWays(modified+'R', r, c-1);
        }
    }

    //Maze with 


}
