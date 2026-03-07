package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Select operation:");
        System.out.println("1. Add");


        int choice = scanner.nextInt();
        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        int result = 0;
        switch (choice){
            case 1:
                result = calculator.add(a,b);
                break;
            default:
                System.out.println("Invalid operation");
                scanner.close();
                return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
