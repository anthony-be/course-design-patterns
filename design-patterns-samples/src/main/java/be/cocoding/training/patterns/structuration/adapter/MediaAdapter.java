package be.cocoding.training.patterns.structuration.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if("wav".equals(audioType)){
            advancedPlayer = new WavPlayer();
        }else if("mp4".equals(audioType)){
            advancedPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if("wav".equals(audioType)){
            advancedPlayer.playWav(filename);
        }else if("mp4".equals(audioType)){
            advancedPlayer.playMp4(filename);
        }
    }
}
