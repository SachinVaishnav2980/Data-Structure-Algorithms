public class Shapes {

    public void area(){
        System.out.println("I am in shapes");
    }

    //If we make the area method of parent class as static then we cannot override it.
    //coz overriding depends on object while static does not depend on object so no relation between these two.
    //can inherit but cannot override

    // public static void area(){
    //     System.out.println("I am in shapes");
    // }


}
