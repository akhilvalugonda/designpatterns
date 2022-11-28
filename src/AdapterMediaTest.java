import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AdapterMediaTest {

    @Test
    public void test_playMusic() {
        AdapterMedia adapterMedia = new AdapterMedia();
        String audioType = "mp4";
        String fileName = "song1.mp4";

        String output = adapterMedia.playMusic(audioType, fileName);
        Assert.assertEquals("Playing mp4 file" + fileName, output);
    }
    }
