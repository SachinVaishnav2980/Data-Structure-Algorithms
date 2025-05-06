public class MinDominoRot {
    public static void main(String[] args) {
        int []tops = {2,1,2,4,2,2};
        int []bottoms={5,2,6,2,3,2};
        System.out.println(minDominoRotations(tops, bottoms));

    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int ans1=conversionToTarget(tops, bottoms, tops[0]);
        int ans2=conversionToTarget(tops, bottoms, bottoms[0]);
        if(ans1>0 && ans2>0){
            return Math.min(ans1,ans2);
        }
        if(ans1>0){
            return ans1;
        }else{
            return ans2;
        }
    }

    public static int conversionToTarget(int []tops, int []bottoms, int target){
        int topConv=0;
        int bottomConv=0;
        for(int i=0;i<tops.length;i++){
            if((tops[i]!=target)&&(bottoms[i]!=target)){
                return -1;
            }
            if(tops[i]!=target && (bottoms[i]==target)){
                topConv++;
            }else{
                bottomConv++;
            }
        }
        return Math.min(topConv,bottomConv);
    }
}
