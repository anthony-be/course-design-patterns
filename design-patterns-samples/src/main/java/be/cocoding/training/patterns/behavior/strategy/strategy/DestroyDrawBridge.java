package be.cocoding.training.patterns.behavior.strategy.strategy;

public class DestroyDrawBridge implements Strategy {

    @Override
    public void execute() {
        System.out.println("Force the drawbridge and destroy the door");
    }

}
