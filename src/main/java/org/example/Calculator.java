package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Log undefined for zero or negative numbers");
        }

        return Math.log(x);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}