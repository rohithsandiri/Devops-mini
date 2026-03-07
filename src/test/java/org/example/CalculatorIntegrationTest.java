package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {

    @Test
    public void testAdditionThenMultiplication() {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);     // 10
        int multiplyResult = calculator.multiply(addResult, 2); // 20

        assertEquals(20, multiplyResult);
    }

    @Test
    public void testPowerThenLog() {

        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2, 3); // 8
        double logResult = calculator.naturalLog(powerResult);

        assertEquals(Math.log(8), logResult, 0.0001);
    }

    @Test
    public void testFactorialThenDivision() {

        Calculator calculator = new Calculator();

        long factorialResult = calculator.factorial(5); //120
        double divisionResult = calculator.divide((int) factorialResult, 10);

        assertEquals(12.0, divisionResult, 0.0001);
    }
}