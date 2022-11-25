package be.cocoding.training.patterns.behavior.strategy;

import java.util.Random;

public enum Weather {

    SUNNY, FOGGY, HEAT_WAVE, RAIN;

    public static Weather getRandomWeather(){
        int ordinal = new Random().nextInt(5);
        return Weather.values()[ordinal-1];
    }

}
