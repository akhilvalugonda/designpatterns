public class AudioPlayer implements MediaPlayer {

    public void play(String fileName) {
        if(fileName.contains("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (fileName.contains("vlc")) {
            System.out.println("Playing Vlc file: " + fileName);
        } else if (fileName.contains("mp4")) {
            System.out.println("Playing mp4 file: " + fileName);
        } else {
            System.out.println("Type of audio not supported, filename: " + fileName);
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing Vlc file: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {

        } else {
            System.out.println("Type of audio not supported: " + audioType);
        }
    }
}