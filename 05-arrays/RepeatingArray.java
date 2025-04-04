import java.util.Arrays;

public class RepeatingArray {
    public static void main(String[] args) {
        int []arr={1,3,5,5,7,7,7,9,11,15,15,15,15};
        int []ans=repeatingArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] repeatingArray(int []arr){
        int []res=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            int ans=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(ans==arr[j]){
                    count++;
                }
            }
            if(count>1){
                res[i]=ans;
            }
        }
        return res;
    }

//         public static int[] resultArray(int []arr, int ans){
//             int []res=new int[arr.length];
//             for(int i=0;i<arr.length;i++){
//                 int count=0;
//                 if(ans==arr[i]){
//                     count++;
//                 }
//                 if(count>1){
//                     res[i]=ans;
//                 }
//             }
//             return res;
//         }
}
