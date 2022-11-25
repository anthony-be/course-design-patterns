package be.cocoding.training.patterns.structuration.adapter;

public class WavPlayer implements AdvancedMediaPlayer {

    @Override
    public void playWav(String filename) {
        System.out.println("Play WAV file: " + filename);
    }

    @Override
    public void playMp4(String filename) {
        // Rien
    }
}
