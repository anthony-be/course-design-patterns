package be.cocoding.training.patterns.structuration.proxy;

public class Client {

    public static void main(String[] args) {
        Document document = new Document("my awesome text", "my image.png");

        document.displayText();

        System.out.println(" ");
        document.displayImage();

        System.out.println(" ");
        document.displayImage();
    }
}
