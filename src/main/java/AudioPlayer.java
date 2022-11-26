public class AudioPlayer implements MediaPlayer {

    MediaAdapter ma;

    public void play(String fileName) {
        if(fileName.contains("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (fileName.contains("vlc")) {
            ma = new MediaAdapter("vlc");
            ma.playMusic("vlc", fileName);
        } else if (fileName.contains("mp4")) {
            ma = new MediaAdapter("mp4");
            ma.playMusic("mp4", fileName);
        } else {
            System.out.println("Type of audio not supported, filename: " + fileName);
        }
    }

    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            ma = new MediaAdapter(audioType);
            ma.playMusic(audioType, fileName);
        } else {
            System.out.println("Type of audio not supported: " + audioType + ", filename: " + fileName);
        }
    }
}