package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorIntegrationTest {

    @Test
    public void testAdditionIntegration() {

        Calculator calculator = new Calculator();

        int result = calculator.add(7, 8);

        assertEquals(15, result);
    }
}