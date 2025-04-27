public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(40));
    }

    public static float root(int n){
        float start=1;
        float end=n;
        while (start<=end) {
            float mid=start+(end-start)/2;
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
