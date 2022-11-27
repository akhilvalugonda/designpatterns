public class AdapterPattern implements MusicPlayer{
    AdvancedMediaPlayer amp;

    public AdapterPattern(String Type){

        if(Type.equalsIgnoreCase("vlc")){
            amp=new VlcPlayer();
        }

        else if(Type.equalsIgnoreCase("mp4")){
            amp=new Mp4Player();
        }
    }

    @Override
    public void playMusic(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            amp.playVlcPlayer(fileName);
        } else if (audioType.equalsIgnoreCase(("mp4"))) {
            amp.playMp4Player(fileName);

        }
    }
}
