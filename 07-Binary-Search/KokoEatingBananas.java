import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int []pile={30,11,23,4,20};
        // System.out.println(Math. floorDiv(3, 6));
        int hour=6;
        System.out.println(minEatingSpeed(pile, hour));
    }

    public static int minEatingSpeed(int []pile, int hour){
        int max=Arrays.stream(pile).max().getAsInt();
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int total=totalHours(pile,mid);
            if(total<hour){
                end=mid-1;
            }else if(total>hour){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int totalHours(int []nums, int mid){
        int totalHour=0;
        for(int i=0;i<nums.length;i++){
            totalHour+=Math.ceil((double)nums[i]/(double)mid);
        }
        return totalHour;
    }

    
}
