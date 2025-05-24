import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        sumTriangle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sumTriangle(int []arr){
        if(arr.length==1){
            return;
        }
        int []res=new int[arr.length-1];
        for(int i=0;i<res.length;i++){
            res[i]=arr[i]+arr[i+1];
        }
        sumTriangle(res);        
        System.out.println(Arrays.toString(res));
    }
}
