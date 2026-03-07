package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {

    @Test
    public void testMultipleOperations() {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);
        int multiplyResult = calculator.multiply(addResult, 2);

        assertEquals(20, multiplyResult);
    }

    @Test
    public void testPowerAndLogIntegration() {

        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2, 3); // 8
        double logResult = calculator.naturalLog(powerResult);

        assertEquals(Math.log(8), logResult, 0.0001);
    }

    @Test
    public void testFactorialAndDivision() {

        Calculator calculator = new Calculator();

        long factorialResult = calculator.factorial(5); //120
        double divisionResult = calculator.divide((int) factorialResult, 10);

        assertEquals(12.0, divisionResult, 0.0001);
    }
}