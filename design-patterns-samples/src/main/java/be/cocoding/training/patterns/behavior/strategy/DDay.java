package be.cocoding.training.patterns.behavior.strategy;

import be.cocoding.training.patterns.behavior.strategy.strategy.*;

public class DDay {

    public static void main(String[] args) {
        Warlord warlord = new Warlord();

        Weather weather = Weather.getRandomWeather();
        System.out.println("Weather: " + weather);

        Strategy strategy;
        switch (weather){
            case SUNNY: strategy = new DestroyDrawBridge(); break;
            case FOGGY: strategy = new ClimbNorthWall(); break;
            case HEAT_WAVE: strategy = new SurroundTheCity(); break;
            case RAIN: strategy = new NegotiateAndMarry(); break;
            default:
                throw new RuntimeException("Go back home and take a Java training :-) ");
        };

        warlord.setStrategy(strategy);
        warlord.takeTheCity();
    }
}
