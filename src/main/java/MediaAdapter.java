public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advMP;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advMP = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advMP = new Mp4Player();
        }
    }

    @Override
    public void playMusic(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advMP.playVlcPlayer(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advMP.playMp4Player(fileName);
        }
    }
}
