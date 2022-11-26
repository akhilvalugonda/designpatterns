public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        //Methods for failure
        audioPlayer.play("wma", "song4.wma");
        audioPlayer.play("onlyFilename.docx");

        //Methods for righteous test
        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("onlyFilename.mp3");
        audioPlayer.play("mp4","song2.mp4");
        audioPlayer.play("onlyFilename.mp4");
        audioPlayer.play("vlc","song3.vlc");
        audioPlayer.play("onlyFilename.vlc");


    }
}
