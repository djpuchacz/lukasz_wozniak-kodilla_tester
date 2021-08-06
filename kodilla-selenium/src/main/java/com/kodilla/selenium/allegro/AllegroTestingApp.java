package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.allegro.pl");

        //akceptacja ciasteczek:
        WebElement inputField = driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Zmieniam zgody']/preceding-sibling::BUTTON"));
        inputField.click();

        //przełączenie kategorii produktów na "Elektronika":
        WebElement categoryCombo = driver.findElement(By.xpath("//BUTTON[@type='submit']/..//SELECT[@class='mr3m_1 m7er_k4 mj6k_n7 _k70df mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4']"));

        Select categorySelect = new Select(categoryCombo);
        //categorySelect.selectByIndex(3);
        categorySelect.selectByValue("/kategoria/elektronika");

        //wyszukiwanie "Mavic mini":
        WebElement searchField = driver.findElement(By.xpath("//SELECT[@class='mr3m_1 m7er_k4 mj6k_n7 _k70df mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4']/../../..//INPUT[@required='']"));
        searchField.sendKeys("Mavic mini");

        //kliknięcie szukaj:
        WebElement searchButton = driver.findElement(By.xpath("//BUTTON[@type='submit']/..//INPUT[@required='']"));
        searchButton.submit();
    }
}




