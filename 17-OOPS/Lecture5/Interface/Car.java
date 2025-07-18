package Lecture5.Interface;

public class Car implements Engine, Media{
    @Override
    public void start(){
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stops like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I accelerates like a normal car");
    }
}
