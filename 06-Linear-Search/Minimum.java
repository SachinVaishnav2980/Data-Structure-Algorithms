public class Minimum {
    public static void main(String[] args) {
        int []arr={20,49,53,67,564,445,992,33};
        int min=Integer.MAX_VALUE;
        int ans=minimumElement(arr, min);
        System.out.println(ans);
    }

    public static int minimumElement(int []arr, int min){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element<min){
                min=element;
            }
        }
        return min;
    }
}
