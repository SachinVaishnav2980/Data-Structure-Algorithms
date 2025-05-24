
public class MinAndMaxElement {
    public static void main(String[] args) {
        int []arr={1, 4, 45, 6, 10, -8};
        minAndmax(arr,1,arr[0],arr[0]);
    }

    public static void minAndmax(int []arr, int index, int min, int max){
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        if(index==arr.length){
            System.out.println("min = "+min+", " + "max = "+max);
            return;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        if(arr[index]<min){
            min=arr[index];
        }
        index++;
        minAndmax(arr, index, min, max);
    }
}
