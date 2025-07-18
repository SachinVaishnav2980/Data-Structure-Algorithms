package Lecture5;
public class Daughter extends Parent{
    public Daughter(int age, String name){
        super(age, name);
    }

    @Override
    void normal(){
        super.normal();
    }

    @Override
    void carrer(){
        System.out.println("I want to become Doctor");
    }

    void partner(){
        System.out.println("I love "+name+" he is "+age+" years old");
    }
}
