package be.cocoding.training.patterns.construction.factorymethod;

import be.cocoding.training.patterns.construction.factorymethod.models.Shape;

public class Client {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.makeShape("circle");
        circle.draw();

        Shape square = factory.makeShape("square");
        square.draw();

        Shape rectangle = factory.makeShape("rectangle");
        rectangle.draw();
    }

}
