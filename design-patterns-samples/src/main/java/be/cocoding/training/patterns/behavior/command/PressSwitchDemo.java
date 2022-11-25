package be.cocoding.training.patterns.behavior.command;

public class PressSwitchDemo {

    public static void main(String[] args) {
        // Definitions
        Light light = new Light();
        FlipDownCommand downCommand = new FlipDownCommand(light);
        FlipUpCommand upCommand = new FlipUpCommand(light);

        SwitchManager switchMgr = new SwitchManager();
        switchMgr.register("on", upCommand);
        switchMgr.register("off", downCommand);

        // Interaction
        switchMgr.execute("on");
        switchMgr.execute("off");
        switchMgr.execute("on");
    }
}
