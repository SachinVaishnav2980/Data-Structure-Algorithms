//Although child class is inheriting all the properties of parent class but if any property is private it cannot be accessed outside the parent class.
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(BoxWeight other){
        super();
        weight=other.weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }


    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); //What is this??
        //Its simply call the parent class constructor who have these arguments.
        //Used to initialize values present in parent class.
        this.weight=weight;
        // super.weight=weight;

        //Whenver we inherit the parent class then for getting the properties of parent class always use super keyword.
        // For eg if we have weight property in parent class then it can be call here via super keyword
    }

}
