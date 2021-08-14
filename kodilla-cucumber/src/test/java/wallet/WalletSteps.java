package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        // Successful withdrawal from a wallet in credit
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });
        When("I request $30", () -> {
         //Cashier cashier = new Cashier(cashSlot);
         cashier.withdraw(wallet, 30); //utworzyliśmy nowego kasjera oraz wydaliśmy polecenie wypłaty 30 dolarów ze wskazanego portela
        });
        Then("$30 should be dispensed", () -> { //weryfikujemy, czy zawartość kasetki jest taka sama jak kwota zlecona do wypłaty
            Assert.assertEquals(30, cashSlot.getContents());
        });

        // Failed Withdrawal from a wallet in credit
        Given("I have deposited $300 in my wallet", () -> {
            wallet.deposit(300);
            Assert.assertEquals("Incorrect wallet balance", 300, wallet.getBalance());
        });
        When("I request $301", () -> {
            // Write code here that turns the phrase above into concrete actions
            cashier.withdraw(wallet, 301);
        });
        Then("$301 should be dispensed", () -> {
            Assert.assertEquals("Requested amount is higher than balance",301, cashSlot.getContents());
        });

        // Successful withdrawal from a wallet in credit
        Given("I have deposited $400 in my wallet", () -> {
            wallet.deposit(400);
            Assert.assertEquals("Incorrect wallet balance",400, wallet.getBalance());
        });
        When("I request $400", () -> {
            cashier.withdraw(wallet, 400);
        });
        Then("$400 should be dispensed", () -> {
            Assert.assertEquals(400, cashSlot.getContents());
        });








    }
}
