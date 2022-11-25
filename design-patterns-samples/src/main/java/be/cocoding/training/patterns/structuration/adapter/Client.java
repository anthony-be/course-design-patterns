package be.cocoding.training.patterns.structuration.adapter;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Nothing Else Matter.mp3");
        audioPlayer.play("mp4", "Until it sleeps.mp4");
        audioPlayer.play("wav", "Always Remember Us.vlc");
        audioPlayer.play("avi", "Basket.avi");
    }
}
