package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        //WebElement inputField = driver.findElement(By.className("gh-tb ui-autocomplete-input"));
        WebElement inputField = driver.findElement(By.name("_nkw"));

        inputField.sendKeys("laptop");
        inputField.submit();


        /*
        //dla Firefoxa
        System.setProperty("webdriver.gecko.driver", "C:\\selenium-drivers\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("laptop");
        inputField.submit();
        */
    }
}
