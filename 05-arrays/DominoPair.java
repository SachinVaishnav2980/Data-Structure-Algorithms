public class DominoPair {
    public static void main(String[] args) {
        int [][]dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        System.out.println(numEquivDominoPairs(dominoes));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        for(int row=0;row<dominoes.length-1;row++){
            for(int next=row+1;next<dominoes.length;next++){
                int col=0;
                if((dominoes[row][col]==dominoes[next][col] && dominoes[row][col+1]==dominoes[next][col+1]) ||(dominoes[row][col]==dominoes[next][col+1] && dominoes[row][col+1]==dominoes[next][col]) ){
                    count++;
                }
            }
            
        }
        return count;
    }
}
