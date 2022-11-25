package be.cocoding.training.patterns.structuration.facade;

public class Cpu {

    public void freeze(){
        System.out.println("Freezing CPU");
    }

    public void jump(int position){
        System.out.println("Jumping CPU to position : " + position);
    }

    public void start(){
        System.out.println("Starting CPU...");
    }
}
