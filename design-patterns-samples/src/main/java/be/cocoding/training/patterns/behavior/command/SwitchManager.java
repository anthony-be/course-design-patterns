package be.cocoding.training.patterns.behavior.command;

import java.util.HashMap;
import java.util.Map;

public class SwitchManager {

    private final Map<String, Command> commandMap = new HashMap<>();

    public void register(String cmdName, Command command){
        commandMap.put(cmdName, command);
    }

    public void execute(String cmdName){
        Command command = commandMap.get(cmdName);
        if(command == null){
            throw new IllegalArgumentException("No command registered for name: " + cmdName);
        }
        command.execute();
    }
}
