public class AudioPlayer implements MusicPlayer {
    MusicAdapter musicAdapter;

    @Override
    public String play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            musicAdapter = new MusicAdapter(audioType);
            musicAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
        return audioType;
    }
}