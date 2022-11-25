package be.cocoding.training.patterns.behavior.chainofresponsability;

public class ConsoleLogger extends Logger {


    public ConsoleLogger(int level) {
        super(level);
    }

    public ConsoleLogger(int level, Logger parentLogger) {
        super(level, parentLogger);
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing log into the Console. Message: " + message);
    }
}
