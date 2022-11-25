package be.cocoding.training.patterns.structuration.proxy;

public class Document {

    private final String text;

    private final String imagePath;
    private final Image image;

    public Document(String text, String imagePath) {
        this.text = text;
        this.imagePath = imagePath;
        image = new ProxyImage(imagePath);
    }

    public void displayText(){
        System.out.println("Display text: " + text);
    }

    public void displayImage(){
        image.display();
    }
}
