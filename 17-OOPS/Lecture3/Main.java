public class Main {
    public static void main(String[] args) {
        // Box box=new Box();
        // System.out.println(box.h+" "+box.l+" "+box.w);
        // Box box1=new Box(4);
        // System.out.println(box1.h+" "+box1.l+" "+box1.w);

        //Calling Boxweight class for super keyword use
        // BoxWeight box=new BoxWeight(4, 5, 6, 7);
        // System.out.println(box.h+" "+box.l+" "+box.w+" "+box.weight);

        Box box=new BoxWeight(2, 3, 4, 8);
        // System.out.println(box.weight); //we can't access the weight property here using box.weight why??
        //reference variable is diiferent and objext is different. It simply referencing the property of Box class int boxExtends object which cannot be done coz of subclass property can't be inherited by parent class.

        // BoxWeight box1=new Box(2, 3, 4, 8)
        //cannot access the child class constructor with object of parent class coz parent class don't know anything about the weight property of child class

        Shapes object=new Shapes();
        Circle objeCircle=new Circle();
        Square objSquare=new Square();
        //which method will be called depends on what object is created this is we called upcasting. and this is how method overridning works
        //but if the subclass is not overriding the superclass then doing this thing will create an method call of ref. class
        //coz normally Shapes obj=new Square(); this is handled at compile time but in overriden situation it is being handeled at run time,
        //Simple concept of upcasting and method overriding.
        Shapes obj=new Square();  //Here ref class is shape and obj is of square still 
        obj.area();    //we'll get square area in this line which shouldn't be happen. Here concept of Polymorphism or Method overriding comes.
        object.area();
        objeCircle.area();
        objSquare.area();
    }

}
