package be.cocoding.training.patterns.construction.singleton;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        // Print all keys
        List<String> keys = singleton.getProperties();
        keys.stream().forEach(System.out::println);
        System.out.println("************************");

        // Print application name
        String applicationName = singleton.getValue("application.name");
        System.out.println(applicationName);

        System.out.println("************************");
        // Print all keys & values
        keys.stream().forEach(key -> {
            String value = singleton.getValue(key);
            System.out.println(key + "=" + value);
        });


    }
}
