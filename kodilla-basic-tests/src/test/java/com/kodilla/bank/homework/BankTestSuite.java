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
    public void shouldCountNumberAllTransactionsEvenIfInvalidTransactionTriedToBeMade(){
       Bank bank = new Bank();
       bank.add(1, 50, -100);
       assertEquals(14, bank.countTotalCashIn() + bank.countTotalCashOut());
   }
}
