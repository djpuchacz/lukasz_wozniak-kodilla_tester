package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) { //kasjer uzupełnia przekazaną kasetkę
        wallet.debit(amount);
        cashSlot.dispense(amount);
    }
}
