package Lecture5.Interface;

public class CDplayer implements Media {

    
    @Override
    public void start(){
        System.out.println("Music start");
    }
    @Override
    public void stop(){
        System.out.println("Music stop");
    }
}
