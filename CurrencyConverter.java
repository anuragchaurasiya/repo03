package MyProfile;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter amount in USD: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid amount.");
                return;
            }

            double usd = scanner.nextDouble();
            if (usd < 0) {
                System.out.println("Amount cannot be negative.");
                return;
            }

            System.out.print("Enter sample USD-to-INR rate: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid exchange rate.");
                return;
            }

            double rate = scanner.nextDouble();
            if (rate <= 0) {
                System.out.println("Exchange rate must be greater than zero.");
                return;
            }

            System.out.printf("Converted amount: ₹%.2f%n", usd * rate);
            System.out.println("Note: Use a verified live rate for real transactions.");
        }
    }
}