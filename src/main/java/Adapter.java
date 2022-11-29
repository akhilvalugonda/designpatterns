public class Adapter implements MusicPlayer {

   AdvancedMediaPlayer media;

   public Adapter(String type){
   
      if(type.equalsIgnoreCase("vlc") ){
         media = new VlcPlayer();			
         
      }else if (type.equalsIgnoreCase("mp4")){
         media = new Mp4Player();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         media.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         media.playMp4(fileName);
      }
   }
}
