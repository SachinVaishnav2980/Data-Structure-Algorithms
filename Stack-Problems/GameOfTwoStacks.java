//HackerRank problem

import java.util.Arrays;

public class GameOfTwoStacks{
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={6,7,8,9};
        System.out.println(maxScore(0, a, b));
    }

    public static int maxScore(int x,int []a, int []b){
        return maxCount(x,a,b,0,0)-1;
    }

    public static int maxCount(int maxSum, int []a, int []b, int sum, int count){
        if(sum>maxSum){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1=maxCount(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2=maxCount(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);
        return Math.max(ans1,ans2);
    }
}
