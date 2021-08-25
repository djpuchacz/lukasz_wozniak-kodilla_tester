package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    //private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        // Successful withdrawal from a wallet in credit
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        // Successful withdrawal from a wallet in credit
        Given("I have deposited $400 in my wallet", () -> {
            wallet.deposit(400);
            Assert.assertEquals("Incorrect wallet balance", 400, wallet.getBalance());
        });
        When("I request $400", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 400);
        });
        Then("$400 should be dispensed", () -> {
            Assert.assertEquals(400, cashSlot.getContents());
        });

        //  Prevent users from taking out more money than their wallet contains
        Given("there is $1000 in my wallet", () -> {
            wallet.deposit(1000);
            Assert.assertEquals(1000, wallet.getBalance());
        });
        When("I withdraw $2000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 2000);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(1000, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            Assert.assertEquals("You don't have sufficient funds in your account", cashier.withdraw(wallet,2000));
        });

        // Display balance after operations
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect display of account balance",100,wallet.getBalance());
        });
        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 50);
            wallet.deposit(500);
        });
        Then("I should see that the balance is $550", () -> {
            Assert.assertEquals("Your balance is $550",wallet.balanceMessage());
        });

    }
}