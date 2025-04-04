public class LinearSearch {
    public static void main(String[] args) {
        int []arr={20,49,53,67,564,445,992,3};
        int target=992;
        // if(isLinearSearch(arr, target)){
        //     System.out.println("Element found");
        // }else{
        //     System.out.println("Element not found");
        // }
        int ans=linearSearch(arr, target);
        System.out.println(ans);
    }

    //returning true/false
    // public static boolean isLinearSearch(int []arr, int target){
    //     if(arr.length==0){
    //         return false;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // returning index
    // public static int linearSearch(int []arr, int target){
    //     if(arr.length==0){
    //         return -1;
    //     }
    //     for(int index=0;index<arr.length;index++){
    //         if(arr[index]==target){
    //             return index;
    //         }
    //     }
    //     return -1;
    // }

    //using enhanced for loop
    public static int linearSearch(int []arr, int target){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        for(int element: arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MIN_VALUE;
    }
}
