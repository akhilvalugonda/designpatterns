public class AudioPlayer implements MusicPlayer {
    MusicPlayer mp;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")||audioType.equals("mp4"))
        {
          AdapterPattern ap=new AdapterPattern(audioType);
          ap.playMusic(audioType, fileName);
        }
        else {
            System.out.println("Audio type not supported for the file: " + fileName);
        }
    }
}