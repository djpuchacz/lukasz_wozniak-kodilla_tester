package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("testuser@gmail.com");
        inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField.sendKeys("hasło");


        /*
        W powyższym kodzie zmienna inputField została użyta dla dwóch pól. Takie ponowne użycie zmiennej ułatwia później refaktoryzację
        narzędziami wbudowanymi w IntelliJ. Jeżeli pojawi się jeszcze kilka wystąpień tej samej zmiennej, to podczas ekstrakcji
        "zduplikowanego" kodu do osobnej metody IntelliJ sam wykryje duplikaty i zaproponuje automatyczne wyciągnięcie powtarzającego się
        kawałka do zewnętrznej metody. Jest to nawyk programistyczny,który ma zastosowanie wtedy, gdy chcemy coś wykonywać na
        kolejnych elementach tego samego typu, różniących się szczegółami.
         */
    }
}