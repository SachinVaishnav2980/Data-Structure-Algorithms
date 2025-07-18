package Lecture2;
public class StaticBlock {
    static int a=4;
    static int b;

    static{
        System.out.println("I am a static block i only run once when first object is created.");
        b=a*5;
    }


    public static void main(String[] args) {
            StaticBlock obj=new StaticBlock();
            System.out.println(StaticBlock.a+" "+StaticBlock.b);
            StaticBlock.b+=3;
            StaticBlock obj2=new StaticBlock();
            System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
