package be.cocoding.training.patterns.construction.builder;

import be.cocoding.training.patterns.construction.builder.models.Meal;

public class Client {

    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();
        Meal beefMeal = builder.makeBeef();
        beefMeal.showMeal();

        Meal vegetarianMeal = builder.makeVegetarian();
        vegetarianMeal.showMeal();
    }
}
