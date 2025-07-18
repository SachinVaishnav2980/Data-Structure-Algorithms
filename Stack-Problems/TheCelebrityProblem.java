public class TheCelebrityProblem {
    public static void main(String[] args) {
        int mat[][]={
            {1,1,0},
            {0,1,0},
            {0,1,1}
        };
        System.out.println(celebrity(mat));
    }


    public static int celebrity(int mat[][]) {
        int top=0;
        int bottom=mat.length-1;
        while(top<bottom){
            if(mat[top][bottom]==1){
                top++;
            }else if(mat[bottom][top]==1){
                bottom--;
            }else{
                top++;
                bottom--;
            }
        }

        if(top>bottom) return -1;
        for(int i=0;i<mat.length;i++){
            if(i==top) continue;
            if(mat[top][i]==0 && mat[i][top]==1) continue;
            else return -1;
        }

        return top;
    }

    //O(n*n+n) worst case complexity
    // public static int celebrity(int mat[][]) {
    //     int []knowme=new int[mat.length];
    //     int []iknow=new int[mat.length];
    //     for(int i=0;i<mat.length;i++){
    //         for(int j=0;j<mat[0].length;j++){
    //             if(mat[i][j]==1){
    //                 knowme[j]++;
    //                 iknow[i]++;
    //             }
    //         }
    //     }

    //     for(int i=0;i<mat.length;i++){
    //         if(knowme[i]==mat.length && iknow[i]==1){
    //             return i;
    //         }
    //     }
    //     return -1;
        
    // }
}
