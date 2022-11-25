package be.cocoding.training.patterns.behavior.chainofresponsability;


import static be.cocoding.training.patterns.behavior.chainofresponsability.Logger.INFO;
import static be.cocoding.training.patterns.behavior.chainofresponsability.Logger.DEBUG;
import static be.cocoding.training.patterns.behavior.chainofresponsability.Logger.ERROR;

public class Client {

    public static void main(String[] args) {
        Logger logger = getChainOfLogger();

        logger.logMessage(DEBUG, "First message in debug");
        logger.logMessage(INFO, "Second message in info");
        logger.logMessage(ERROR, "Third message in warn");

    }

    private static Logger getChainOfLogger(){
        Logger consoleLogger = new ConsoleLogger(DEBUG);
        Logger dbLogger = new DBLogger(INFO, consoleLogger);
        Logger fileLogger = new FileLogger(ERROR, dbLogger);
        return consoleLogger;
    }
}
