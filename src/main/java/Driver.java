public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Despacito.mp3");
        audioPlayer.play("mp4", "Mushkil.mp4");
        audioPlayer.play("vlc", "BaarBaarDhekho.vlc");
        audioPlayer.play("avi", "KalaChesma.avi");
    }
}