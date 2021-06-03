package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.5;
        double b = 8.5;
        double sumResult = calculator.sum(a, b);
        assertEquals(14, sumResult,0.01);

    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 5.5;
        double b = 8.5;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult,0.01);
    }

    @Test
    public void testExpPositiveNumber() {
        Calculator calculator = new Calculator();
        double a = 2.5;
        double expResult = calculator.exp(a);
        assertEquals(6.25, expResult,0.01);
    }
    @Test
    public void testExpZero() {
        Calculator calculator = new Calculator();
        double a = 0.0;
        double expResult = calculator.exp(a);
        assertEquals(0.0, expResult,0.01);
    }
    @Test
    public void testExpNegativeNumber() {
        Calculator calculator = new Calculator();
        double a = -3.5;
        double expResult = calculator.exp(a);
        assertEquals(12.25, expResult,0.01);
    }
}
