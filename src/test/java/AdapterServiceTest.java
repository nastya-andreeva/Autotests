import edu.misis.nastyusha.adapter.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterServiceTest {

    @Test
    public void testAdapterService() {
        AdapterService service = new AdapterService();
        service.exec();

        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);

        assertEquals(hole.fits(roundStick), true);

        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);

        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        assertEquals(hole.fits(smallSquareStickAdapter), true);
        assertEquals(hole.fits(largeSquareStickAdapter), false);
    }
}
