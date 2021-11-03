import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void userRegistrationWithValidData() throws InterruptedException {

        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();
        Thread.sleep(5000);

        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.sendKeys("testowyemailqw@testowy.com");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Lucas");
        driver.findElement(By.id("customer_lastname")).sendKeys("Kowalski");
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(5000);

        boolean isAlertDisplayed = driver.findElement(By.className("alert")).isDisplayed();
        Assert.assertTrue(isAlertDisplayed);

    }

    @After
    public void tearDown() {
        //driver.quit();
    }

}
