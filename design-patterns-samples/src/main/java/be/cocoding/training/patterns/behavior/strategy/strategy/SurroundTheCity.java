package be.cocoding.training.patterns.behavior.strategy.strategy;

public class SurroundTheCity implements Strategy {
    @Override
    public void execute() {
        System.out.println("Surround the city and wait city surrender");
    }
}
