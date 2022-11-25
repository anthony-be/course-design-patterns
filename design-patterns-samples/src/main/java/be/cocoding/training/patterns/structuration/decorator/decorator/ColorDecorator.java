package be.cocoding.training.patterns.structuration.decorator.decorator;

import be.cocoding.training.patterns.structuration.decorator.shape.Shape;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class ColorDecorator extends ShapeDecorator {

    private final Color color;

    public ColorDecorator(Shape shape, Color color) {
        super(shape);
        requireNonNull(color);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("***** Colored shape in " + color.toString() + " *****");
        shape.draw();
        System.out.println("***************************");
    }
}
