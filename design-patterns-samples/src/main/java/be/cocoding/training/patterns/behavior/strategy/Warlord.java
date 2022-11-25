package be.cocoding.training.patterns.behavior.strategy;

import be.cocoding.training.patterns.behavior.strategy.strategy.Strategy;

public class Warlord {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void takeTheCity(){
        strategy.execute();
    }
}
