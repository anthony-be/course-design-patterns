package be.cocoding.training.patterns.construction.builder.models.food;

import be.cocoding.training.patterns.construction.builder.models.pack.Box;
import be.cocoding.training.patterns.construction.builder.models.Item;
import be.cocoding.training.patterns.construction.builder.models.pack.Packaging;

public abstract class Burger implements Item {

    public Packaging packaging() {
        return new Box();
    }

    public abstract float price();
}
