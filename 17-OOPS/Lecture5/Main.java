package Lecture5;
public class Main {
    public static void main(String[] args) {
        // Parent mom=new Parent(); //abstarct classes cannot be instantiate like this.
        Parent.hello();
        Son son=new Son(25, "Khushi");
        son.carrer();
        son.partner();
        son.normal();

        Parent daughter=new Daughter(24, "Kartik");
        daughter.carrer();
        daughter.partner();

        
        daughter.normal();
    }

}
