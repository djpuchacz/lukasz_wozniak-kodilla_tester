package wallet;

public class Wallet {
    private int balance = 0;
    private int display;
    private int initialBalance;

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

    public void displayBalance (int currentMoney) {
        this.display = currentMoney;
    }

    public int getInitialBalance () {
        this.initialBalance = display;
        return initialBalance;
    }

    public String withdrawFromWallet(int money) {
        if (money > getInitialBalance()) {
            return "You don't have enough money in your wallet !";
        }
        else
            return "You have just withdrawn money.";
        }

}
