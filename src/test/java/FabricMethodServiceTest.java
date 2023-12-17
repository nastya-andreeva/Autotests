import edu.misis.nastyusha.fabric.domain.entities.AbstractDialog;
import edu.misis.nastyusha.fabric.domain.entities.Button;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricMethodServiceTest {

    @Test
    public void testRender() {
        boolean[] rendered = {false};
        AbstractDialog dialog = new AbstractDialog() {
            @Override
            public Button getButton() {
                return () -> rendered[0] = true;
            }
        };

        dialog.render();
        assertTrue(rendered[0]);
    }
}
