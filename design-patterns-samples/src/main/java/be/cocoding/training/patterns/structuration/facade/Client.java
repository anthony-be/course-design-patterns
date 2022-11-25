package be.cocoding.training.patterns.structuration.facade;

public class Client {

    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }
}
