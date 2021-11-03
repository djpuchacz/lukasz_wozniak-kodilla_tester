package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ta-ebookrental-fe.herokuapp.com/login");


        WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        inputLogin.sendKeys("Batman");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        inputPassword.sendKeys("Gotham2021");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));
        loginButton.submit();

        driver.close();
    }
}