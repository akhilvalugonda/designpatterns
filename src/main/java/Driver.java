public class Driver {
    public static void main(String[] args) {
        AdapterMedia ad = new AdapterMedia();
        ad.playMusic("mp4", "song2.mp4");
        ad.playMusic("mp3", "song1.mp3");
        ad.playMusic("wma", "song4.wma");
        ad.playMusic("vlc", "song3.vlc");
       
    }
}
