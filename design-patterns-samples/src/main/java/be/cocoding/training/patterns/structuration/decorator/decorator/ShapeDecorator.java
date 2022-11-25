package be.cocoding.training.patterns.structuration.decorator.decorator;

import be.cocoding.training.patterns.structuration.decorator.shape.Shape;

import static java.util.Objects.requireNonNull;

public abstract class ShapeDecorator implements Shape {

    protected final Shape shape;

    protected ShapeDecorator(Shape shape) {
        requireNonNull(shape);
        this.shape = shape;
    }
}
