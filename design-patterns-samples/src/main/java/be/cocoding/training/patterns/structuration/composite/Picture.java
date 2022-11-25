package be.cocoding.training.patterns.structuration.composite;

public class Picture extends Graphic {
    @Override
    public void draw() {
        System.out.println("**** Drawing a Picture **** ");
        for(Graphic g : getChildren()){
            g.draw();;
        }
        System.out.println("*************************** ");
    }
}
