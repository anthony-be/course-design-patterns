package be.cocoding.training.patterns.structuration.proxy;

public class RealImage implements Image{

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImage(filename);
    }

    private void loadImage(String filename) {
        System.out.println("Loading image : " + filename);
    }

    @Override
    public void display() {
        System.out.println("Display Image : " + filename);
    }
}
