
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestMp4Player {

    private final ByteArrayOutputStream os = new ByteArrayOutputStream();
    private final PrintStream out = System.out;
    AudioPlayer ap;
    @Before
    public void setup () {
        ap = new AudioPlayer();
        System.setOut(new PrintStream(os));
    }

    @Test
    public void testMp4OneParam() {
        ap.play("mp4");
        assertEquals("Playing mp4 file: mp4\r\n", os.toString());
    }

    @Test
    public void testMp4TwoParam() {
        ap.playMusic("mp4", "mp4.mp4");
        assertEquals("Playing mp4 file: mp4.mp4\r\n", os.toString());
    }

    @Test
    public void testMp3OneParam() {
        ap.play("mp3");
        assertEquals("Playing mp3 file: mp3\r\n", os.toString());
    }

    @Test
    public void testMp3TwoParam() {
        ap.playMusic("mp3", "mp3.mp3");
        assertEquals("Playing mp3 file: mp3.mp3\r\n", os.toString());
    }

    @Test
    public void testVlcOneParam() {
        ap.play("vlc");
        assertEquals("Playing Vlc file: vlc\r\n", os.toString());
    }

    @Test
    public void testVlcTwoParam() {
        ap.playMusic("vlc", "vlc.vlc");
        assertEquals("Playing Vlc file: vlc.vlc\r\n", os.toString());
    }

    @Test
    public void testFailOneParam() {
        ap.play("wav");
        assertEquals("Type of audio not supported, filename: wav\r\n", os.toString());
    }

    @Test
    public void testFailTwoParam() {
        ap.playMusic("wav", "wav.wav");
        assertEquals("Type of audio not supported: wav, filename: wav.wav\r\n", os.toString());
    }
}
