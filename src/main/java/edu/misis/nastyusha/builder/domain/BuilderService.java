package edu.misis.nastyusha.builder.domain;

import edu.misis.nastyusha.builder.domain.car.*;

public class BuilderService {
    private Car car1 = new Car.Builder()
            .setCarType(CarType.CITY_CAR)
            .setEngine(new Engine(2.0, 0))
            .setSeats(4)
            .setGpsNavigator(new GpsNavigator("address 1 to address 2"))
            .build();
    private Car car2 = new Car.Builder()
            .setCarType(CarType.SPORTS_CAR)
            .setEngine(new Engine(4.0, 0))
            .setSeats(2)
            .setTripComputer(new TripComputer())
            .setTransmission(Transmission.SINGLE_SPEED)
            .build();

    public void exec() {
        System.out.println(car1);
        car2.getTripComputer().setCar(car2);
        car2.getTripComputer().showStatus();
    }

    public Car getCar1() {
        return car1;
    }

    public Car getCar2() {
        return car2;
    }
}
