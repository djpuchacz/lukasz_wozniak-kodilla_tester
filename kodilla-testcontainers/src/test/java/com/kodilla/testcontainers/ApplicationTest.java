package com.kodilla.testcontainers;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.SKIP;

public class ApplicationTest {

    @Rule
    public Network network = Network.newNetwork();

    @Rule
    public GenericContainer webServer =
            new GenericContainer(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("/tmp/index.html", "index.html")
                            .withFileFromClasspath("/tmp/style.css", "style.css")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:2.4")
                                            .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                            .copy("/tmp/style.css", "/usr/local/apache2/htdocs")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Rule
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer<>()
                    .withCapabilities(new ChromeOptions())
                    .withNetwork(network)
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    // .withRecordingMode(SKIP, null)
                    .withRecordingFileFactory(new DefaultRecordingFileFactory());

    @Test
    public void customImageTest() throws InterruptedException, IOException {
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://my-server/");


        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String title = driver.findElement(By.xpath("/html/body/div/section[2]/h2[1]")).getText();
        assertEquals("Moje hobby:", title);
    }
}