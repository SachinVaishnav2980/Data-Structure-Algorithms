public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(40));
    }

    public static int root(int n){
        int start=1;
        int end=n;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid>n){
                end=mid-1;
            }else{

                start=mid+1;
            }
        }
        return -1;
    }
}
