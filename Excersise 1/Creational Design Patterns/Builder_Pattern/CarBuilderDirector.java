package Builder_Pattern;

import java.util.Scanner;

public class CarBuilderDirector {
    public Car constructCar() throws CarBuilderException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter engine type: ");
            String engine = scanner.nextLine();
            if (engine.isEmpty()) {
                throw new CarBuilderException("Engine type cannot be empty.");
            }

            System.out.print("Enter seat material: ");
            String seats = scanner.nextLine();
            if (seats.isEmpty()) {
                throw new CarBuilderException("Seat material cannot be empty.");
            }

            System.out.print("Enter trip computer type: ");
            String tripComputer = scanner.nextLine();
            if (tripComputer.isEmpty()) {
                throw new CarBuilderException("Trip computer type cannot be empty.");
            }

            System.out.print("Enter GPS type: ");
            String gps = scanner.nextLine();
            if (gps.isEmpty()) {
                throw new CarBuilderException("GPS type cannot be empty.");
            }

            return new CarBuilder()
                    .setEngine(engine)
                    .setSeats(seats)
                    .setTripComputer(tripComputer)
                    .setGps(gps)
                    .build();
        } finally {
            scanner.close();
        }
    }
}
