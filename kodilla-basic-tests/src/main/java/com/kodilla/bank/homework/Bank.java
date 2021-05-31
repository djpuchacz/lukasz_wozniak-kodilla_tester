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

    public int countBalance() { //całkowity bilans ze wszystkich bankomatów,
        int sum = 0;
        for (CashMachine item : items) {
            sum = sum + item.cashMachineSaldo();
        }
        return sum;
    }

    public int countCashOut() { //liczbę transakcji związanych z wypłatą,
        int sum = 0;
        for (CashMachine item : items) {
        sum = sum + item.noOfTransactionsCashOut();}
        return sum;
    }

    public int countCashIn() { //liczbę transakcji związaną z wpłatą pieniędzy,
        int sum = 0;
        for (CashMachine item : items) {
            sum = sum + item.noOfTransactionsCashIn();}
        return sum;
    }
    public int sumCashOut() { //
        int sum = 0;
        for (CashMachine item : items) {
            sum = sum + item.sumOfCashOut();
        }
        return sum;
    }

    public int avgCashOut() { //średnią wartość wypłaty,
        return sumCashOut()/countCashOut();
    }

    public void avgCashIn() { //średnią wartość wpłaty,

    }
}
