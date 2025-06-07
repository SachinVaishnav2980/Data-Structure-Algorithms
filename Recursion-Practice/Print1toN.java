//This code will print numbers from 1 to N

public class Print1toN {
    public static void main(String[] args) {
        print(10, 1);
    }

    public static void print(int n, int index) {
        if(index>n){
            return;
        }
        System.out.print(index+" ");
        print(n, index+1);
    }

}
