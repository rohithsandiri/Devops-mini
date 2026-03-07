package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(5, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(5, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, calculator.naturalLog(Math.E), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }
}