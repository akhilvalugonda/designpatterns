public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlcPlayer(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4Player(String fileName) {
        //do nothing
    }
}