// package Lecture5.Interface;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        this.engine=new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void upgrade(){
        this.engine=new ElectricEngine();
    }


}
