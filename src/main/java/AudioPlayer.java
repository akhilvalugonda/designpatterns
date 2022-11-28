public class AudioPlayer implements MusicPlayer {
    
    AdapterMusicadapter;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } 
        
        else if {audioType.equalsIgnorecase("Vlc") audioType.isequalstothecase("mp4")){
            Mediaadapter = new media(audiotype);
            Mediaadapter.play(audioType,fileName);
        
        
        }
        
        
        else {
           
            System.out.println("Audio type not supported for the file: " + fileName);
        }
        
        
        
        
        
    }
    
    
    
}
