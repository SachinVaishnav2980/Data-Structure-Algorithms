public class SearchInRange {
    public static void main(String[] args) {
        int []arr={20,49,53,67,564,445,992,3};
        int target=3;
        int start=1;
        int end=5;
        int ans=linearSearchRange(arr, target, start, end);
        System.out.println(ans);
    }

    public static int linearSearchRange(int []arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
