package be.cocoding.training.patterns.structuration.facade;

public class Memory {

    public void load(int position, String data){
        System.out.println("Loading memory at position " + position + " with data: " + data);
    }
}
