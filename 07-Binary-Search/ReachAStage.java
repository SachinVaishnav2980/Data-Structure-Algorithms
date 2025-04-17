import java.lang.Math;
public class ReachAStage {
    public static void main(String[] args) {
        System.out.println(reachNumber(3));
    }

    public static int reachNumber(int target) {
        target=Math.abs(target);
        long start=1;
        long end=target;
        long pos=0;
        long minSteps=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            long dist=mid*(mid+1)/2;
            if(dist>=target){
                pos=dist;
                minSteps=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        long diff=pos-target;
        if(diff % 2 != 0){
            if(minSteps % 2 != 0){
                minSteps += 2;
            }else{
                minSteps+=1;
            }
        }
        return (int)minSteps;
    }
}
