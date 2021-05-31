package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.values = new int[0];// tablica ze zrealizowanymi transakcjami
        this.size = 0;
    }
    public void add(int value) { //metoda dodająca wartość
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int cashMachineSaldo() { //metoda zwracająca saldo
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + this.values[i];
        }
        return sum;
    }

    public int noOfTransactions() { //metoda zwracająca liczbę transakcji (długość tablicy ?)
        return this.size;
    }
    public int noOfTransactionsCashOut() { //metoda zwracająca liczbę transakcji (długość tablicy ?)
        int less = 0;
        for (int i=0; i < values.length; i++) {
            if (values[i]<0)
                less++;
        }
        return less;
    }
    public int noOfTransactionsCashIn() { //metoda zwracająca liczbę transakcji (długość tablicy ?)
        int less = 0;
        for (int i=0; i < values.length; i++) {
            if (values[i]>0)
                less++;
        }
        return less;
    }
    public int sumOfCashOut() {
        int sum =0;
        for (int i=0; i < values.length; i++) {
            if (values[i] < 0) {
                sum = sum + values[i];
            }
        }
        return sum;
    }
}

