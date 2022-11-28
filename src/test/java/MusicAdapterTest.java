import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class MusicAdapterTest {

    @Test
    public void play()
        {
            MusicAdapter musicAdapter = new MusicAdapter("mp3");
            String audioType = "mp3";
            String fileName = "Despacito.mp3";

            String output = musicAdapter.play(audioType, fileName);
            Assertions.assertEquals( "mp3", audioType);
        }

}