package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public void searchResults() throws InterruptedException {
        /*
        //akceptacja ciasteczek:
        WebElement cookiesField = driver.findElement(By.cssSelector("#L2AGLb > div"));
        cookiesField.click();
        */

        PageFactory.initElements(driver, GoogleSearch.class); //inicjalizujemy obiekty na stronie,
        Thread.sleep(3000);
        inputField.sendKeys("Kodilla"); //w pole wyszukiwania wpisujemy "Kodilla",
        googleResults = loadResults(driver);
        googleResults.iSeeResults();

    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}




