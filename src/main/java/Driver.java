public class Driver {
    public static void main(String[] args) {
       AdapterMedia adapter = new AdapterMedia();
       adapter.playMusic("mp4","song1.mp4");
       adapter.playMusic("mp3", "song2.mp3");
       adapter.playMusic("vlc", "song3.vlc");
    }
}
