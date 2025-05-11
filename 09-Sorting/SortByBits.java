import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,10000};
        System.out.println(Arrays.toString(sortByBits(arr)));

    }

    public static int[] sortByBits(int[] arr) {
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=countSetbit(arr[i])*100001+arr[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<arr.length;i++){
            ans[i]%=100001;
        }
        return ans;
    }

    public static int countSetbit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n-(n&-n);
        }
        return count;
    }
}


