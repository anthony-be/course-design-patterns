package be.cocoding.training.patterns.construction.singleton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Properties properties;

    private Singleton() {
        readFile();
    }

    private void readFile() {
        try {
            properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/application.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read properties file",e);
        }
    }

    public static Singleton getInstance(){
        return instance;
    }

    public List<String> getProperties(){
        return new ArrayList<>(properties.stringPropertyNames());
    }

    public String getValue(String property){
        return properties.getProperty(property);
    }
}
