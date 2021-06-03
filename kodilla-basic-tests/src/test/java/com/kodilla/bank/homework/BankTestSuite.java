package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldReturnZeroBalanceIfThereIsNoCashMachine() {
        Bank bank = new Bank();
        double balance = bank.countTotalBalance();
        assertEquals(0,balance);
    }
    @Test
    public void shouldReturnCountTotalBalance() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(-800,bank.countTotalBalance());
    }
    @Test
    public void shouldReturnNumberOfTotalCashOut() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(3,bank.countTotalCashOut());
    }
    @Test
    public void shouldReturnNumberOfTotalCashIn() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(5,bank.countTotalCashIn());

    }
    @Test
    public void shouldReturnValueOfTotalCashOut() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(-2700,bank.sumTotalCashOut());

    }
    @Test
    public void shouldReturnValueOfTotalCashIn() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(1900,bank.sumTotalCashIn());

    }
    @Test
    public void shouldReturnValueOfAverageCashOut() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(-900,bank.avgTotalCashOut(),0.01);

    }
    @Test
    public void shouldReturnValueOfAverageCashIn() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-400);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(300);
        cashMachine2.add(400);
        cashMachine2.add(-1500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(600);
        cashMachine3.add(-800);
        cashMachine3.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.add(cashMachine3);

        assertEquals(380,bank.avgTotalCashIn(),0.01);

    }
    @Test
    public void shouldReturnAverageIfThereIsNoCashOut() {
        Bank bank = new Bank();
        double balance = bank.avgTotalCashOut();
        assertEquals(0,balance,0.01);
    }
    @Test
    public void shouldReturnAverageIfThereIsNoCashIn() {
        Bank bank = new Bank();
        double balance = bank.avgTotalCashIn();
        assertEquals(0,balance,0.01);
    }
}
