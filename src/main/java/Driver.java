public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic("mp3", "song1.mp3");
        audioPlayer.playMusic("vlc", "vlcSong.vlc");
        audioPlayer.playMusic("mp4", "mp4Song.mp4");
        audioPlayer.playMusic("wma", "wmaSong.wma");
    }
}

