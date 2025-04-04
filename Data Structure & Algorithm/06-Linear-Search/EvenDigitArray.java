public class EvenDigitArray {
public static void main(String[] args) {
    int []nums={12,345,2,6,7896};
    int ans=findNumbers(nums);
    System.out.println(ans);
}

    public static int findNumbers(int[] nums) {
        int calc=0;
        for(int num:nums){
            if(even(num)){
                calc++;
            }
        }
        return calc;
    }


    public static int count(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

    public static boolean even(int num){
        int numberOfDigit=count(num);
        return numberOfDigit%2==0;
    }
}
