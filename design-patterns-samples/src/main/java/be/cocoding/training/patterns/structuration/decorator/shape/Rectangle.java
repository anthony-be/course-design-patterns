package be.cocoding.training.patterns.structuration.decorator.shape;

public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with dimension: " + width + " x " + height);
    }
}
