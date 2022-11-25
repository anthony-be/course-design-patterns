package be.cocoding.training.patterns.behavior.strategy.strategy;

public class ClimbNorthWall implements Strategy {
    @Override
    public void execute() {
        System.out.println("Climb the North wall");
    }
}
