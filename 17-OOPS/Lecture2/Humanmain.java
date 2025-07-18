package Lecture2;
//Q. Why we cannot make a static referenct to a nonstatic method.
//Its preetty simple that staic can be accessed from anywhere but non static method requies an instance what instance an object.
//An object is required for methof if it non static and want tp make a static reference.
//If you do not make reference of static to nonstatic at the end it will bw taken care by the main method which is static.
//What i meant with the previous line is-
//Humanmain main=new Humanmain();
        // main.fun();
//At the end it will all be taken care by the object of main class no need of static.

public class Humanmain {
    public static void main(String[] args) {
        Humanmain obj=new Humanmain();
        Human sachin=new Human("Sachin Vaishnav", 22, 5000000);
        Human Aditya=new Human("Aditya Pareta", 22, 5000000);
        Human Shantnu=new Human("Shantnu Singh Rajawat", 22, 5000000);
        System.out.println(sachin.name);
        System.out.println(Aditya.name);
        System.out.println(Shantnu.name);
        System.out.println(Human.population);
        // System.out.println(Human.population);

        // obj.humanRace(); // It is not giving any error coz we provided an instance(object) to it.
        Humanmain main=new Humanmain();
        main.fun();
    }

    void fun(){
        humanRace();
    }
    void humanRace(){

    }
}
