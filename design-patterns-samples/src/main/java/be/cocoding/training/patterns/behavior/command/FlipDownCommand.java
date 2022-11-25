package be.cocoding.training.patterns.behavior.command;

public class FlipDownCommand implements Command {

    private final Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
