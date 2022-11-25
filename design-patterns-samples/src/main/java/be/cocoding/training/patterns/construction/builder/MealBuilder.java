package be.cocoding.training.patterns.construction.builder;

import be.cocoding.training.patterns.construction.builder.models.Meal;
import be.cocoding.training.patterns.construction.builder.models.drink.Beer;
import be.cocoding.training.patterns.construction.builder.models.drink.Water;
import be.cocoding.training.patterns.construction.builder.models.food.Beef;
import be.cocoding.training.patterns.construction.builder.models.food.Vegetarian;

public class MealBuilder {

    public MealBuilder() {
    }

    public Meal makeVegetarian(){
        Meal meal = new Meal();
        meal.addItem(new Vegetarian());
        meal.addItem(new Water());
        return meal;
    }

    public Meal makeBeef(){
        Meal meal = new Meal();
        meal.addItem(new Beef());
        meal.addItem(new Beer());
        return meal;
    }
}
