public class MaxPointsFromCards {
    public static void main(String[] args) {
        int []cardPoints = {96,90,41,82,39,74,64,50,30};
        int k = 8;
        System.out.println(maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        for(int i=k-1;i>=0;i--){
            leftSum+=cardPoints[i];
        }
        int maxSum=leftSum;
        int index=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[index];
            index--;
            maxSum=Math.max(maxSum, leftSum+rightSum);
        }
        return maxSum;
    }
}

