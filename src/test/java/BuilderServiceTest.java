import edu.misis.nastyusha.builder.domain.BuilderService;
import edu.misis.nastyusha.builder.domain.car.Car;
import edu.misis.nastyusha.builder.domain.car.CarType;
import edu.misis.nastyusha.builder.domain.car.Transmission;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderServiceTest {

    @Test
    public void testExec() {
        BuilderService builderService = new BuilderService();
        builderService.exec();

        Car car1 = builderService.getCar1();
        Car car2 = builderService.getCar2();

        assertNotNull(car1);
        assertNotNull(car2);

        assertEquals(CarType.CITY_CAR, car1.getCarType());
        assertEquals(CarType.SPORTS_CAR, car2.getCarType());

        assertEquals(2.0, car1.getEngine().getVolume());
        assertEquals(4, car1.getSeats());

        assertEquals(4.0, car2.getEngine().getVolume());
        assertEquals(2, car2.getSeats());
        assertNotNull(car2.getTripComputer());
        assertEquals(Transmission.SINGLE_SPEED, car2.getTransmission());

        assertEquals("address 1 to address 2", car1.getGpsNavigator().getRoute());

        car2.getTripComputer().setCar(car2);
        assertEquals(false, car2.getEngine().isStarted());
    }
}

