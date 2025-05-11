import java.util.ArrayList;
import java.util.Arrays;

public class RankTransform {
    public static void main(String[] args) {
        int []arr={37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int [] arrayRankTransform(int[] arr) {
        int []sorted=Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);


        ArrayList<Integer> unique=new ArrayList<>();
        for(int i=0;i<sorted.length;i++){
            if(i==0){
                unique.add(sorted[0]);
            }
            if(i>0 && sorted[i]!=sorted[i-1]){
                unique.add(sorted[i]);
            }
        }
        int []ans=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=binarySearch(unique,arr[i])+1;
        }
        return ans;
        
    } 

    public static int binarySearch(ArrayList<Integer> unique, int target){
        int start=0;
        int end=unique.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(unique.get(mid)==target){
                return mid;
            }else if(unique.get(mid)<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    
}
