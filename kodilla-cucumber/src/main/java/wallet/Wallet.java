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

    public void debit(int money)  //metoda pozwalająca na pomniejszenie stanu konta
    {//if
        this.balance -= money;
    }

    public String currentBalance(){
        return "Your current balance is $" + balance;
    }
}
