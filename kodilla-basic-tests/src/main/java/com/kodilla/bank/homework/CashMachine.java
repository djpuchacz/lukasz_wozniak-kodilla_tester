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
        int saldo = 0;
        for (int i = 0; i < values.length; i++) {
            saldo = saldo + this.values[i];
        }
        return saldo;
    }

    public int noOfTransactions() { //metoda zwracająca liczbę transakcji (długość tablicy ?)
        return this.size;
    }
    public int noOfTransactionsCashOut() { //metoda zwracająca liczbę transakcji związanych z wypłatą z bankomatu
        int cashOut = 0;
        for (int i=0; i < values.length; i++) {
            if (values[i]<0)
                cashOut++;
        }
        return cashOut;
    }
    public int noOfTransactionsCashIn() { //metoda zwracająca liczbę transakcji związanych z wpłatą w bankomacie
        int cashIn = 0;
        for (int i=0; i < values.length; i++) {
            if (values[i]>0)
                cashIn++;
        }
        return cashIn;
    }
    public int sumOfCashOut() { //metoda zwracająca sumę wartości wypłat w bankomacie (potrzebna będzie do obliczenia średniej)
        int sumOut =0;
        for (int i=0; i < values.length; i++) {
            if (values[i] < 0) {
                sumOut = sumOut + values[i];
            }
        }
        return sumOut;
    }
    public int sumOfCashIn() { //metoda zwracająca sumę wartości wpłat w bankomacie (potrzebna będzie do obliczenia średniej)
        int sumIn =0;
        for (int i=0; i < values.length; i++) {
            if (values[i] > 0) {
                sumIn = sumIn + values[i];
            }
        }
        return sumIn;
    }
    public int[] getValues() {
        return values;
    }
}

