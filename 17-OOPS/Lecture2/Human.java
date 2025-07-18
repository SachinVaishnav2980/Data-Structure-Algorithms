package Lecture2;
//Static methods can be accessed without creating the object of that class
//In Line11 - when we r using this.population it is giving the warning that static field should be accessed in a static way. It simply means Use class Name to access the population or static variable.
//Something which is non static belongs to object only and cannot be accessed without creating the object.



public class Human {
    String name;
    int age;
    int salary;
    static long population;
    
    public Human(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        Human.population += 1;   
    }
}



