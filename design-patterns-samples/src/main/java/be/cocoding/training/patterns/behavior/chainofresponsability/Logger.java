package be.cocoding.training.patterns.behavior.chainofresponsability;

public abstract class Logger {

    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    private final int level;

    private Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    protected Logger(int level, Logger parentLogger) {
        this.level = level;
        if(parentLogger!=null) {
            parentLogger.setNextLogger(this);
        }
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
