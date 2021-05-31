package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testExp() {
        Calculator calculator = new Calculator();
        double a = 1;
        double expResult = calculator.exp(a);
        assertEquals(1, expResult);
    }
    //dodać test dla zera i <0
    //co z deltą ?
}
