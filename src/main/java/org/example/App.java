package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Log (ln)");
            System.out.println("8. Power (x^b)");
            System.out.println("0. Exit");

            System.out.print("Select operation: ");

            int choice;

            while (!scanner.hasNext()) {
                try {
                    Thread.sleep(10000);   // wait for input
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }
            if (choice == 0) {
                System.out.println("Exiting calculator...");
                break;
            }

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter first number: ");
                        int a1 = scanner.nextInt();

                        System.out.print("Enter second number: ");
                        int b1 = scanner.nextInt();

                        System.out.println("Result: " + calculator.add(a1, b1));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        int a2 = scanner.nextInt();

                        System.out.print("Enter second number: ");
                        int b2 = scanner.nextInt();

                        System.out.println("Result: " + calculator.subtract(a2, b2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        int a3 = scanner.nextInt();

                        System.out.print("Enter second number: ");
                        int b3 = scanner.nextInt();

                        System.out.println("Result: " + calculator.multiply(a3, b3));
                        break;

                    case 4:
                        System.out.print("Enter first number: ");
                        int a4 = scanner.nextInt();

                        System.out.print("Enter second number: ");
                        int b4 = scanner.nextInt();

                        System.out.println("Result: " + calculator.divide(a4, b4));
                        break;

                    case 5:
                        System.out.print("Enter number: ");
                        double x = scanner.nextDouble();

                        System.out.println("Result: " + calculator.squareRoot(x));
                        break;

                    case 6:
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();

                        System.out.println("Result: " + calculator.factorial(n));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        double ln = scanner.nextDouble();

                        System.out.println("Result: " + calculator.naturalLog(ln));
                        break;

                    case 8:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();

                        System.out.print("Enter exponent: ");
                        double exp = scanner.nextDouble();

                        System.out.println("Result: " + calculator.power(base, exp));
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("Invalid numeric input. Please try again.");
                scanner.nextLine();
            }
        }
// this comment is adding to test the pipeline
        scanner.close();
    }
}