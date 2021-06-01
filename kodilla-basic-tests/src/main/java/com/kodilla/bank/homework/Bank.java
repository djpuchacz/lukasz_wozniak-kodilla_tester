package com.kodilla.bank.homework;

import com.kodilla.bank.homework.CashMachine;

public class Bank {
    private CashMachine[] items = new CashMachine[0];
    int size = 0;

    public void add(CashMachine item) { //metoda dodająca wartość
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(items, 0, newTab, 0, items.length);
        newTab[this.size - 1] = item;
        this.items = newTab;
    }

    public int countTotalBalance() { //całkowity bilans ze wszystkich bankomatów,
        int balance = 0;
        for (CashMachine item : items) {
            balance = balance + item.cashMachineSaldo();
        }
        return balance;
    }

    public int countTotalCashOut() { //liczba transakcji związanych z wypłatą pieniędzy z wszystkich bankomatów
        int NoOfTotalCashOut = 0;
        for (CashMachine item : items) {
            NoOfTotalCashOut = NoOfTotalCashOut + item.noOfTransactionsCashOut();}
        return NoOfTotalCashOut;
    }

    public int countTotalCashIn() { //liczbę transakcji związaną z wpłatą pieniędzy z wszystkich bankomatów
        int NoOfTotalCashIn = 0;
        for (CashMachine item : items) {
            NoOfTotalCashIn = NoOfTotalCashIn + item.noOfTransactionsCashIn();}
        return NoOfTotalCashIn;
    }
    public int sumTotalCashOut() { // metoda zwracająca sumę wartości wypłat ze wszystkich bankomatów
        int sumTotalOut = 0;
        for (CashMachine item : items) {
            sumTotalOut = sumTotalOut + item.sumOfCashOut();
        }
        return sumTotalOut;
    }
    public int sumTotalCashIn() {// metoda zwracająca sumę wartości wpłat ze wszystkich bankomatów
        int sumTotalIn = 0;
        for (CashMachine item : items) {
            sumTotalIn = sumTotalIn + item.sumOfCashIn();
        }
        return sumTotalIn;
         }

    public double avgTotalCashOut() { //średnią wartość wypłaty ze wszystkich bankomatów
        return sumTotalCashOut()/countTotalCashOut();
    }

    public double avgTotalCashIn() { //średnią wartość wpłaty we wszystkich bankomatach
        return sumTotalCashIn()/countTotalCashIn();

    }
}
