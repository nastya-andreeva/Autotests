import edu.misis.nastyusha.proxy.domain.ProxyService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyServiceTest {

    @Test
    public void testProxyService() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ProxyService proxyService = new ProxyService();
        proxyService.exec();

        System.setOut(originalOut);

        String expectedOutput = "Connecting to http://www.youtube.com... Connected!\n" +
                "Downloading populars... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Most popular videos on YouTube (imagine fancy HTML)\n" +
                "ID: sadgahasgdas / Title: Catzzzz.avi\n" +
                "ID: asdfas3ffasd / Title: Dancing video.mpq\n" +
                "ID: 3sdfgsd1j333 / Title: Programing lesson#1.avi\n" +
                "ID: mkafksangasj / Title: Dog play with ball.mp4\n" +
                "ID: dlsdk5jfslaf / Title: Barcelona vs RealM.mov\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/catzzzzzzzzz... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: catzzzzzzzzz\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com... Connected!\n" +
                "Downloading populars... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Most popular videos on YouTube (imagine fancy HTML)\n" +
                "ID: sadgahasgdas / Title: Catzzzz.avi\n" +
                "ID: asdfas3ffasd / Title: Dancing video.mpq\n" +
                "ID: 3sdfgsd1j333 / Title: Programing lesson#1.avi\n" +
                "ID: mkafksangasj / Title: Dog play with ball.mp4\n" +
                "ID: dlsdk5jfslaf / Title: Barcelona vs RealM.mov\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/dancesvideoo... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: dancesvideoo\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/catzzzzzzzzz... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: catzzzzzzzzz\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/someothervid... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: someothervid\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com... Connected!\n" +
                "Downloading populars... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Most popular videos on YouTube (imagine fancy HTML)\n" +
                "ID: sadgahasgdas / Title: Catzzzz.avi\n" +
                "ID: asdfas3ffasd / Title: Dancing video.mpq\n" +
                "ID: 3sdfgsd1j333 / Title: Programing lesson#1.avi\n" +
                "ID: mkafksangasj / Title: Dog play with ball.mp4\n" +
                "ID: dlsdk5jfslaf / Title: Barcelona vs RealM.mov\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/catzzzzzzzzz... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: catzzzzzzzzz\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Retrieved list from cache.\n" +
                "\n" +
                "-------------------------------\n" +
                "Most popular videos on YouTube (imagine fancy HTML)\n" +
                "ID: sadgahasgdas / Title: Catzzzz.avi\n" +
                "ID: asdfas3ffasd / Title: Dancing video.mpq\n" +
                "ID: 3sdfgsd1j333 / Title: Programing lesson#1.avi\n" +
                "ID: mkafksangasj / Title: Dog play with ball.mp4\n" +
                "ID: dlsdk5jfslaf / Title: Barcelona vs RealM.mov\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/dancesvideoo... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: dancesvideoo\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Retrieved video 'catzzzzzzzzz' from cache.\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: catzzzzzzzzz\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n" +
                "Connecting to http://www.youtube.com/someothervid... Connected!\n" +
                "Downloading video... Done!\n" +
                "\n" +
                "-------------------------------\n" +
                "Video page (imagine fancy HTML)\n" +
                "ID: someothervid\n" +
                "Title: Some video title\n" +
                "Video: Random video.\n" +
                "-------------------------------\n" +
                "\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
