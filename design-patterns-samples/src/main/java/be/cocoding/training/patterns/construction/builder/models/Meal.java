package be.cocoding.training.patterns.construction.builder.models;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0F;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showMeal(){
        System.out.println("**** MEAL ****");
        for(Item item : items){
            System.out.println("Item: " + item.name() + " ## Pack: " + item.packaging().pack() + " ## Price: " + item.price());
        }
        System.out.println("**** Total Cost: " + this.getCost() + "****");
    }
}
