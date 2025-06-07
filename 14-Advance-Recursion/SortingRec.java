public class SortingRec {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10};
        int index=0;
        System.out.println(sort(arr,index));
    }
 
    public static boolean sort(int []arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);
    }
}
