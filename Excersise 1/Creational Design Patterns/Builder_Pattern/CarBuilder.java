package Builder_Pattern;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder setSeats(String seats) {
        car.setSeats(seats);
        return this;
    }

    public CarBuilder setTripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    public CarBuilder setGps(String gps) {
        car.setGps(gps);
        return this;
    }

    public Car build() {
        return car;
    }
}
