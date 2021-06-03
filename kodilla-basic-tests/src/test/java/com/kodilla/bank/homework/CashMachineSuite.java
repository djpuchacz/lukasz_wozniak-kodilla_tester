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
        public void shouldAddTwoElementsToArrayPositiveAndNegative() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(500, values[0]);
        assertEquals(-100, values[1]);
    }
    @Test
    public void shouldReturnCorrectNumberOfCashOut() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);
        cashMachine.add(-400);
        cashMachine.add(-1000);
        cashMachine.add(600);
        cashMachine.add(-350);

        assertEquals(4,cashMachine.noOfTransactionsCashOut());

    }
    @Test
    public void shouldReturnCorrectNumberOfCashIn() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);
        cashMachine.add(-400);
        cashMachine.add(-1000);
        cashMachine.add(600);
        cashMachine.add(-350);

        assertEquals(2,cashMachine.noOfTransactionsCashIn());

    }
    @Test
    public void shouldReturnCorrectNumberOfSumCashOut() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);
        cashMachine.add(-400);
        cashMachine.add(-1000);
        cashMachine.add(600);
        cashMachine.add(-350);

        assertEquals(-1850,cashMachine.sumOfCashOut());

    }
    @Test
    public void shouldReturnCorrectNumberOfSumCashIn() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-100);
        cashMachine.add(-400);
        cashMachine.add(-1000);
        cashMachine.add(600);
        cashMachine.add(-350);

        assertEquals(1100,cashMachine.sumOfCashIn());

    }
}
