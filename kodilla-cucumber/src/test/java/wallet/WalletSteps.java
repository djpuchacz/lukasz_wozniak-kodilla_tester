package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Given("I have deposited $300 in my wallet", () -> {
            wallet.deposit(300);
            Assert.assertEquals("Incorrect wallet balance", 300, wallet.getBalance());
        });
        When("I request $301", () -> {
            cashier.withdraw(wallet, 301);
        });
        Then("$301 should be dispensed", () -> {
            Assert.assertEquals("Requested amount is higher than balance",301, cashSlot.getContents());
        });

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