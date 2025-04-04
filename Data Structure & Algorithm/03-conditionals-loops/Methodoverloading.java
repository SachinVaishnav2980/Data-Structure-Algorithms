public class Methodoverloading {
    public static void main(String[] args) {
        fun("sachin");
        fun(10);
        
    }

    public static void fun(int a){
        System.out.println(a);
    }
    public static void fun(String name){
        System.out.println(name);
    }

}
