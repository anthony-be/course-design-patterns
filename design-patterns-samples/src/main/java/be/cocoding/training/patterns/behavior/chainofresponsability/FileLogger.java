package be.cocoding.training.patterns.behavior.chainofresponsability;

public class FileLogger extends Logger {

    public FileLogger(int level) {
        super(level);
    }

    public FileLogger(int level, Logger parentLogger) {
        super(level, parentLogger);
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing log into the File. Message: " + message);
    }
}
