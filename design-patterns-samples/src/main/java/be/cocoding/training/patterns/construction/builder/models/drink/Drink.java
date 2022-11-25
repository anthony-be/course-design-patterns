package be.cocoding.training.patterns.construction.builder.models.drink;

import be.cocoding.training.patterns.construction.builder.models.Item;
import be.cocoding.training.patterns.construction.builder.models.pack.Bottle;
import be.cocoding.training.patterns.construction.builder.models.pack.Packaging;

public abstract class Drink implements Item {

    public Packaging packaging() {
        return new Bottle();
    }

    public abstract float price();
}
