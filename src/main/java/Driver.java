public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.playMusic("mp3","audio song.mp3");
        audioPlayer.playMusic("vlc","video song.vlc");
        audioPlayer.playMusic("mp4","video song.mp4");
        audioPlayer.playMusic("mp6","other song.mp6");


       /*
        audioPlayer.playMusic("mp3", "song1.mp3");

        Mp4Player mp4MusicPlayer = new Mp4Player();
        mp4MusicPlayer.playMp4Player("song2.mp4");

        VlcPlayer vlcMusicPlayer = new VlcPlayer();
        vlcMusicPlayer.playVlcPlayer("song3.vlc");

        audioPlayer.playMusic("wma", "song4.wma");
        */

    }
}
