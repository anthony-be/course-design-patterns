package be.cocoding.training.patterns.construction.builder.models.food;

public class Vegetarian extends Burger {
    public String name() {
        return "Vegetarian Burger";
    }

    public float price() {
        return 1.75F;
    }
}
