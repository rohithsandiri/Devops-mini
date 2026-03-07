package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Enter first number:");
            int a = scanner.nextInt();

            System.out.println("Enter second number:");
            int b = scanner.nextInt();

            int result = 0;

            switch (choice) {

                case 1:
                    result = calculator.add(a, b);
                    break;

                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}