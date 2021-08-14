import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearch;

public class TestGoogle {
    WebDriver driver;
    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement cookiesField = driver.findElement(By.cssSelector("#L2AGLb > div"));
        cookiesField.click();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
}