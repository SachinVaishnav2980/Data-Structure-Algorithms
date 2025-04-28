public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(3020140));
    }
    static int count=0;
    public static int countZeros(int n){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return countZeros(n/10);
    }
}
