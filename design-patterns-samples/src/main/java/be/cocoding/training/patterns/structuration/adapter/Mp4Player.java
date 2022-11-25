package be.cocoding.training.patterns.structuration.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playWav(String filename) {
        // Rien
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Play MP4 file: " + filename);
    }
}
