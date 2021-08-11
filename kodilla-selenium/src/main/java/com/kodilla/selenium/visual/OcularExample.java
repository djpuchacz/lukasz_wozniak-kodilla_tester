package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");        // [1]
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("E:\\Javapro\\kodilla-selenium\\results"))
                .snapshotPath(Paths.get("E:\\Javapro\\kodilla-selenium\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);
        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close();
    }
}