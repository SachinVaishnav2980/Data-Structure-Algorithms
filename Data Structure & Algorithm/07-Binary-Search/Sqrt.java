public class Sqrt {
    public static void main(String[] args) {
        System.out.println(squareRoot(17));
    }

    public static int squareRoot(int x){
        long start=0;
        long end=x;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (int)end;
    }
}
