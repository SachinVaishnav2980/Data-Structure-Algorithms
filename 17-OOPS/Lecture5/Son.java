package Lecture5;
public class Son extends Parent{

    public Son(int age, String name){
        super(age, name);
    }

    @Override
    void normal(){
        super.normal();
    }

    @Override
    void carrer(){
        System.out.println("I want to become Engineer");
    }

    void partner(){
        System.out.println("I love "+name+" She is "+age+" years old");
    }
}
