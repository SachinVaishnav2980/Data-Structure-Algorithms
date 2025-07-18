public class Numbers {
    //Name of function is same but parameters are different thats
    //we call a method voerloading.
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }



    public static void main(String[] args) {
        // Method overloading
        Numbers number=new Numbers();
        System.out.println(number.sum(5, 10));
        System.out.println(number.sum(20, -4, 59));
    }

}
