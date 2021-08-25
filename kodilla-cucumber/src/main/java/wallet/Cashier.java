package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance())
            return "You don't have sufficient funds in your account";
        else
            wallet.debit(amount);
        cashSlot.dispense(amount);
        return wallet.balanceMessage();
    }


}
