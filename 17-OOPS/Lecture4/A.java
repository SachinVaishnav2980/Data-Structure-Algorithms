
public class A {
    private int num;
    private String name;
    private int []arr;

    //In order to access private methods into other class we use getter and setter methods.
    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }


    public A(int num, String name, int []arr){
        this.num=num;
        this.name=name;
        this.arr=arr;
    }

}
