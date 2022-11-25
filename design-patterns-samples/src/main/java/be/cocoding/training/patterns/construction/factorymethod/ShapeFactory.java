package be.cocoding.training.patterns.construction.factorymethod;

import be.cocoding.training.patterns.construction.factorymethod.models.Circle;
import be.cocoding.training.patterns.construction.factorymethod.models.Rectangle;
import be.cocoding.training.patterns.construction.factorymethod.models.Shape;
import be.cocoding.training.patterns.construction.factorymethod.models.Square;

import static java.util.Objects.requireNonNull;

public class ShapeFactory {

    public Shape makeShape(String type) {
        requireNonNull(type, "Given 'type' parameter cannot be null");

        if("circle".equals(type)){
            return new Circle();
        }else if( "rectangle".equals(type) ){
            return new Rectangle();
        }else if("square".equals(type)){
            return new Square();
        }

        throw new IllegalArgumentException("Type is not supported. Type: " + type);
    }
}
