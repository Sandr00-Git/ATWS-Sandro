package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Welcome to the Ounce Conversion Program!");

        int ounces = -1;
        while (true) {
            System.out.print("\nHow many ounces do you have? ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Blank values are not allowed. Please enter the number of ounces.");
                continue;
            }

            try {
                ounces = Integer.parseInt(input);
                if (ounces < 0) {
                    System.out.println("Your input should be a positive number. Please enter the number of ounces.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("That is not a number! Please enter the number of ounces.");
            }
        }

        System.out.println("Thank you! Converting ounces to pounds.\n");

        String poundsAndOunces = converter.toPoundsAndOunces(ounces);
        String decimalPounds = converter.toPounds(ounces);

        System.out.println(ounces + " oz is equivalent to " + poundsAndOunces + ".");
        System.out.println(ounces + " oz is equivalent to " + decimalPounds + ".");

        System.out.println("\nThank you for using the OCP!");
        scanner.close();
    }
}
