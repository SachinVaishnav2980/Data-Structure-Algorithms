public class Square extends Shapes{

    //If we make the area method of parent class as static then we cannot override it.
    //coz overriding depends on object while static does not depend on object so no relation between these two.

    @Override
    public void area(){
        System.out.println("Area is l*b");
    }
}
