package Lecture5;
//if class is abstract class it cannot be final.
public abstract class Parent {
    abstract void carrer();
    abstract void partner();

    int age;
    String name;

    public Parent(int age, String name){
        this.age=age;
        this.name=name;
    }

    static void hello(){
        System.out.println("Hello!");
    }

    void normal(){
        System.out.println("This is a normal method");
    }
    

}
