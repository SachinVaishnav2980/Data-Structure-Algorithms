
public class SumSubArrayMins {
    public static void main(String[] args) {
        int []arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
        // System.out.println(sumSubarrayMins(arr));
    }

    public static int sumSubarrayMins(int[] arr) {
        int sum=0;
        int mod=(int)Math.pow(10, 9)+7;
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i;j<arr.length;j++){
                min=Math.min(arr[j],min);
                sum=(sum+min)%mod;
            }
        }
        return sum;
    }

    

    
}
