package org.example;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Square Root
    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is not allowed");
        }
        return Math.sqrt(x);
    }

    // Factorial
    public long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not allowed");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Natural Log
    public double naturalLog(double x) {

        if (x <= 0) {
            throw new IllegalArgumentException("Log undefined for zero or negative numbers");
        }

        return Math.log(x);
    }

    // Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}