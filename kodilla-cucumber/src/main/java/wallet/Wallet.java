package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {

    }

    public void deposit(int money) { //metoda dodająca pieniądze
        if(money <=0)
            balance =0;
        else
            this.balance +=money;
    }

    public int getBalance() { //metoda zwracająca saldo

        return balance;
    }

    public void debit(int money) { //metoda pozwalająca na pomniejszenie stanu konta
       this.balance -= money;
    }

    public String balanceMessage(){
        return "Your balance is $" + balance;
    }

}
