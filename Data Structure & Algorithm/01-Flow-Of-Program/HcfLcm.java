import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("num1:");
        int num1=sc.nextInt();
        System.out.print("num2:");
        int num2=sc.nextInt();
        int result_hcf=hcf(num1,num2);
        int result_lcm=lcm(num1, num2);
        System.out.println("HCF of "+num1+" & "+num2+" is:"+result_hcf);
        System.out.println("LCM of "+num1+" & "+num2+" is:"+result_lcm);
        sc.close();
    }

    static int hcf(int num1, int num2){
        while(num2!=0){
            num1=num2;
            num2=num1%num2;
        }
        return num1;
    }

    static int lcm(int num1,int num2){
        int hcf=hcf(num1,num2);
        int lcm=(num1*num2)/hcf;
        return lcm;
    }
}

