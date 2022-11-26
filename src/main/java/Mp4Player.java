public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlcPlayer(String fileName) {

    }

    @Override
    public void playMp4Player(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
