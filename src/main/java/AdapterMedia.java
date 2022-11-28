public class AdapterMedia implements MusicPlayer{
  @override

    public String playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4"))
        {
            return "playing mp4 file " +fileName;
        } else if (audioType.equalsIgnoreCase("mp3")) {
            return "playing mp3 file " +fileName;
        } else if (audioType.equalsIgnoreCase("vlc")) {
            return "playing vlc file " +fileName;
        } else{
            return "Audio type is not supported for this file" + fileName;
        }
    }
}
