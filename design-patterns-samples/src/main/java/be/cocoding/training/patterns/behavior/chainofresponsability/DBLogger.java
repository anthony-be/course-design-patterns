package be.cocoding.training.patterns.behavior.chainofresponsability;

public class DBLogger extends Logger {

    public DBLogger(int level) {
        super(level);
    }

    protected DBLogger(int level, Logger parentLogger) {
        super(level, parentLogger);
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing log into the Database. Message: " + message);
    }
}
