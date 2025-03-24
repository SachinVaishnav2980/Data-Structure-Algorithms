import java.util.Arrays;
public class Integermanipulation {
    public static void main(String[] args) {
        // int num=95468;
        // int num1=num;
        // int prd=1;
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     sum=sum+digit;
        //     num=num/10;
        // }
        // System.out.println("sum:"+sum);
        // while(num1>0){
        //     int digit=num1%10;
        //     prd=prd*digit;
        //     num1=num1/10;
        // }
        // System.out.println("product:"+prd);
        // System.out.println("Difference is:"+(prd-sum));
        fun(12,24,45,8,8,84,5,18,48,5,48,78,74,87,8487,48,487);  //cannot be empty if then amiguity occurs and it shows error.
        fun("sachin","nidhi","yogesh","yogendra","narendra","krishna","laddu","naira","krish","pari");
    }

    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    
}
