package Lecture1;


public class IntroductionClasses {
    public static void main(String[] args) {
        Student student1=new Student();
        // student1.rno=13;
        // student1.name="kunal";
        // student1.marks=88.7f;
        System.out.println(student1.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);

    }


    public static class Student{
        int rno;
        String name;
        float marks;

        Student (){
            this.rno=166;
            this.name="Sachin Vaishnav";
            this.marks=98.7f;
        }

    }
}
