public class SumOfDigit {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(digitSum(num, 0));
    }

    public static int digitSum(int num, int sum){
        if(num==0){
            return sum;
        }
        int digit=num%10;
        sum=sum+digit;
        num=num/10;
        return digitSum(num, sum);
    }
}
