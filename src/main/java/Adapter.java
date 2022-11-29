public class Adapter implements MusicPlayer {

   AdvancedMediaPlayer media;

   public Adapter(String audio){
   
      if(audio.equalsIgnoreCase("vlc") ){
         media = new VlcPlayer();			
         
      }else if (audio.equalsIgnoreCase("mp4")){
         media = new Mp4Player();
      }	
   }

   @Override
   public void playMusic(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         media.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         media.playMp4(fileName);
      }
   }
}
