package be.cocoding.training.patterns.structuration.adapter;

public class AudioPlayer implements MediaPlayer {


    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            // Built-in feature
            System.out.println("Playing mp3 file. Name: " + filename);
        } else if(audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("mp4")){
            //mediaAdapter is providing support to play other file formats
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
