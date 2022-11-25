package be.cocoding.training.patterns.structuration.decorator;

import be.cocoding.training.patterns.structuration.decorator.decorator.BorderDecorator;
import be.cocoding.training.patterns.structuration.decorator.decorator.ColorDecorator;
import be.cocoding.training.patterns.structuration.decorator.shape.Circle;
import be.cocoding.training.patterns.structuration.decorator.shape.Rectangle;
import be.cocoding.training.patterns.structuration.decorator.shape.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // Simple Shapes
        Circle circle = new Circle(5);
        circle.draw();

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.draw();

        // Single decoration shapes
        BorderDecorator borderCircle = new BorderDecorator(circle, 3, "plain");
        borderCircle.draw();

        ColorDecorator coloredRectangle = new ColorDecorator(rectangle, Color.RED);
        coloredRectangle.draw();

        // Double decoration shapes
        Circle circle50 = new Circle(50);
        ColorDecorator coloredCircle50 = new ColorDecorator(circle50, Color.BLUE);
        BorderDecorator borderColoredCircle50 = new BorderDecorator(coloredCircle50, 30, "dotted");
        borderColoredCircle50.draw();

    }
}
