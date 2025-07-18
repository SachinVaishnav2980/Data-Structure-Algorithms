package Lecture2;

public class InnerClasses {
    //Inner classes can be static but outer classes cannot be static referenced.
    static class  Test {
        String name;
        public Test(String name){
            this.name=name;
        }
        
    }

    public static void main(String[] args) {
        Test a =new Test("Sachin");
        Test b= new Test("Aditya");
        //What will it print Sachin Sachin or Sachin Aditya
        System.out.println(a.name);
        System.out.println(b.name);
        //we prev. said that static require no object then why it is printing two different values.
        //The answer is static doesn't require object but if we provide it can work with object also
        //coz main class and static class are connected with objects they does not depend on the object of outer class. 
    }
}
