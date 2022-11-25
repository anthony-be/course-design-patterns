package be.cocoding.training.patterns.structuration.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Graphic> graphics = new ArrayList<>();

        graphics.add(new Line());
        graphics.add(new Rectangle());
        graphics.add(new Text());

        Picture picture = new Picture();
        picture.add(new Text());
        picture.add(new Line());
        picture.add(new Rectangle());
        picture.add(new Rectangle());
        picture.add(new Rectangle());
        graphics.add(picture);

        int i=0;
        for (Graphic graphic : graphics) {
            System.out.println("# " + i++);
            graphic.draw();
        }
    }
}
