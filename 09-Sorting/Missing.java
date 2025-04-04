

public class Missing {
    public static void main(String[] args) {
        int []arr={3,0,1};
        int ans=missing(arr);
        System.out.println(ans);
    }

    public static void cyclicSort(int []arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i];
            if( arr[i]>=0 && arr[i]<arr.length &&arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
    }

    public static int missing(int []arr){
        cyclicSort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }

    public static void swap(int []arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
