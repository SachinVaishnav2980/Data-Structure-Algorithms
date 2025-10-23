public class EditDistance {

    // public int minDistance(String word1, String word2) {
    //     return match(word1, word2, 0, 0, word1.length(), word2.length());
    // }

    // int match(String word1, String word2, int i, int j, int n, int m){
    //     if(i==n && j==m) return 0;
    //     if(i==n) return m-j;
    //     if(j==m) return n-i;

    //     if(i<word1.length() && j<word2.length() && word1.charAt(i)==word2.charAt(j)){
    //         return match(word1, word2, i+1, j+1, n, m);
    //     }

    //     //Explore Insert operation 
    //     int insert=1+match(word1, word2, i, j+1, n, m);

    //     //Explore Delete operation
    //     int delete=1+match(word1, word2, i+1, j, n, m);

    //     //Explore replace operation
    //     int replace=1+match(word1, word2, i+1, j+1, n, m);

    //     return Math.min(insert, Math.min(replace, delete));
    // }

    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int  [][]dp=new int [n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        return match(word1, word2, 0, 0, n, m, dp);
    }

    int match(String word1, String word2, int i, int j, int n, int m, int [][]dp){
        if(i>=n && j>=m) return -1;
        if(i>=n) return m-j;
        if(j>=m) return n-i;

        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)){
            dp[i][j]=match(word1, word2, i+1, j+1, n, m, dp);
            return dp[i][j];
        }

        //Insert
        int insert=1+match(word1, word2, i, j+1, n, m, dp);
        //Delete
        int delete=1+match(word1, word2, i+1, j, insert, m, dp);
        //replace
        int replace=1+match(word1, word2, i+1, j+1, insert, m, dp);

        dp[i][j]= Math.min(insert, Math.min(replace, delete));
        return dp[i][j];
    }
}
