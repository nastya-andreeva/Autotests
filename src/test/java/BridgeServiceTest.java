import edu.misis.nastyusha.bridge.domain.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeServiceTest {

    @Test
    public void testBridgeService() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        BridgeService service = new BridgeService();
        service.exec();

        System.setOut(originalOut);

        String expectedOutput = "Tests with basic remote.\n" +
                "Remote: power toggle\n" +
                "------------------------------------\n" +
                "| I'm radio.\n" +
                "| I'm enabled\n" +
                "| Current volume is 30%\n" +
                "| Current channel is 1\n" +
                "------------------------------------\n" +
                "\n" +
                "Tests with advanced remote.\n" +
                "Remote: power toggle\n" +
                "Remote: mute\n" +
                "------------------------------------\n" +
                "| I'm radio.\n" +
                "| I'm disabled\n" +
                "| Current volume is 0%\n" +
                "| Current channel is 1\n" +
                "------------------------------------\n" +
                "\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
