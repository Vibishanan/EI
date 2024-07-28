package Observer_Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConcreteStock stock = new ConcreteStock();

        Investor investor1 = new ConcreteInvestor("Investor 1");
        Investor investor2 = new ConcreteInvestor("Investor 2");

        stock.registerInvestor(investor1);
        stock.registerInvestor(investor2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the new stock price (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double price = Double.parseDouble(input);
                stock.setPrice(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        scanner.close();
    }
}
