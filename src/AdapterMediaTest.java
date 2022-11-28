import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestAdapterMedia {
    @Test
    public void test_playMusic() {
        AdapterMedia mediaAdapter = new AdapterMedia();
        String fileName = "ashok.mp3";
        String audioType = "mp3";

        String output = AdapterMedia.playMusic(fileName, audioType);
        Assert.assertEquals("Playing mp3 file: " + fileName, output);
    }
}
