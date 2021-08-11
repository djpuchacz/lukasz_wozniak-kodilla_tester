import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/numberchecker/is_number_divisible_by_3_or_and_5.feature"}
)
public class NumberTestRunner {
}
