package Builder_Pattern;


public class Car {
    private String engine;
    private String seats;
    private String tripComputer;
    private String gps;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getDetails() {
        return "Car with " + engine + ", " + seats + " seats, " +
               "Trip Computer: " + tripComputer + ", GPS: " + gps;
    }
}
