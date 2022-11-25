package be.cocoding.training.patterns.structuration.facade;

public class HardDisk {

    public String read(int logicalBlockAddress, int size){
        System.out.println("Reading hard disk at address " + logicalBlockAddress + " with size " + size);
        return "Data blocks";
    }
}
