package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
        getResults();
    }

    public void getResults(){
        Random random = new Random();
        int number = random.nextInt(results.size()-1);
        WebElement element = results.get(number);
        WebElement pageurl = element.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a"));
        pageurl.click();
        }
}
