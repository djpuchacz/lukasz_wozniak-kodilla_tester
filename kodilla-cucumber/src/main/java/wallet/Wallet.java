package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {

    }

    public void deposit(int money) { //metoda dodająca pieniądze
        this.balance += money;
    }

    public int getBalance() { //metoda zwracająca saldo
        return balance;
    }

}
