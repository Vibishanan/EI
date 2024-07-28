package Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        CarBuilderDirector director = new CarBuilderDirector();
        try {
            Car car = director.constructCar();
            System.out.println(car.getDetails());
        } catch (CarBuilderException e) {
            System.err.println("Failed to build car: " + e.getMessage());
        }
    }
}
