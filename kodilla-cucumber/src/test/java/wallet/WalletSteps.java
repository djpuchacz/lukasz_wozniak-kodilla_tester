package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    //private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
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
        // Successful Withdrawal from a wallet in credit
        Given("I have deposited $300 in my wallet", () -> {
            wallet.deposit(300);
            Assert.assertEquals("Incorrect wallet balance", 300, wallet.getBalance());
        });
        When("I request $301", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 301);
        });
        Then("$301 should be dispensed", () -> {
            Assert.assertEquals("Requested amount is higher than balance", 301, cashSlot.getContents());
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
        When("I withdraw $200", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

        Then("nothing should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });


        // Display balance
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            //dodać kilka operacji
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Your current balance is $100", wallet.currentBalance());
        });

    }
}