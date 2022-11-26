public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        //Methods for failure
        System.out.println("Unsupported:");
        audioPlayer.playMusic("wma", "song4.wma");
        audioPlayer.play("onlyFilename.docx");

        //Methods for righteous test
        System.out.println("Supported:");
        audioPlayer.playMusic("mp3", "song1.mp3");
        audioPlayer.play("onlyFilename.mp3");
        audioPlayer.playMusic("mp4","song2.mp4");
        audioPlayer.play("onlyFilename.mp4");
        audioPlayer.playMusic("vlc","song3.vlc");
        audioPlayer.play("onlyFilename.vlc");


    }
}
