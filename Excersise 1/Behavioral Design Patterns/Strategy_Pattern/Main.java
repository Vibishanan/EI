package Strategy_Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                // Show menu
                System.out.println("Select payment method (1: Credit Card, 2: PayPal, 3: Bitcoin, 4: Exit): ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                if (choice == 4) {
                    System.out.println("Exiting...");
                    running = false;
                    continue;
                }

                // Get the amount
                System.out.println("Enter the amount to pay: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();  // Consume newline

                // Get additional details based on payment method
                switch (choice) {
                    case 1:
                        System.out.println("Enter credit card number: ");
                        String cardNumber = scanner.nextLine();
                        System.out.println("Enter card holder name: ");
                        String cardHolder = scanner.nextLine();
                        context.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolder));
                        break;
                    case 2:
                        System.out.println("Enter PayPal email: ");
                        String email = scanner.nextLine();
                        context.setPaymentStrategy(new PayPalPayment(email));
                        break;
                    case 3:
                        System.out.println("Enter Bitcoin wallet address: ");
                        String walletAddress = scanner.nextLine();
                        context.setPaymentStrategy(new BitcoinPayment(walletAddress));
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                // Perform the payment
                context.pay(amount);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  // Clear the invalid input
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
