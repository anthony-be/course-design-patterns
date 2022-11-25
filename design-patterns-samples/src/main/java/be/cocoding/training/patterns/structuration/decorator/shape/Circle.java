package be.cocoding.training.patterns.structuration.decorator.shape;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius: " + radius);
    }

}
