package be.cocoding.training.patterns.structuration.decorator.decorator;

import be.cocoding.training.patterns.structuration.decorator.shape.Shape;

import static java.util.Objects.requireNonNull;

public class BorderDecorator extends ShapeDecorator {

    private final int size;
    private final String style;

    public BorderDecorator(Shape shape, int size, String style) {
        super(shape);
        requireNonNull(style);
        this.size = size;
        this.style = style;
    }

    @Override
    public void draw() {
        System.out.println("***** Bordered shape with style " + style + " and size " + size + " *****");
        shape.draw();
        System.out.println("***************************");
    }
}
