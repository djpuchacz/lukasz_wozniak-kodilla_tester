package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineSuite {

    @Test
        public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
        }

    @Test
        public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(500, values[0]);
        assertEquals(-100, values[1]);
    }
}
