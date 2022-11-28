public class AdapterPlayer implements MusicPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    AdapterPlayer(String type) {
        switch (type) {
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
        }
    }

    @Override
    public String playMusic(String audioType, String fileName) {
        switch (audioType) {
            case "vlc":
                advancedMediaPlayer.playVlcPlayer(fileName);
                return "vlc";
            case "mp4":
                advancedMediaPlayer.playMp4Player(fileName);
                return "mp4";
        }
        return null;
    }
}