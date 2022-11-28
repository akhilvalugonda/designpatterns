import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MusicAdapterTest {

    @Test
    public void play()
    {
        MusicAdapter musicAdapter = new MusicAdapter("mp3");
        String audioType = "mp3";
        String fileName = "Despacito.mp3";

        String output = musicAdapter.play(audioType, fileName);
        assertEquals( "mp3", audioType, output);
    }

}