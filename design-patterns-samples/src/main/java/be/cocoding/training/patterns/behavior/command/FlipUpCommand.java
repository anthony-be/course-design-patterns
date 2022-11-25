package be.cocoding.training.patterns.behavior.command;

public class FlipUpCommand implements Command {

    private final Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
