package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class IsItDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsItDivisibleSteps() {
        Given("number is {int}", number -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = (int) number;
        });

        When("I ask if number divisible by 3 or by 5 or 3 and 5", () -> {
            // Write code here that turns the phrase above into concrete actions
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkDivisibility(this.number);
        });

        Then("I should get a answer {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
