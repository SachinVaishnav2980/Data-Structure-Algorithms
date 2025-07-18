package Lecture2;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();

        //All 3 ref variables are pointing to same object

    }
}
