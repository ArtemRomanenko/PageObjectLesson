package com.epam.tests.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;


public class AbstractTest {

    protected WebDriver driver;
    protected String SEARCH_QUERY = "Macbook pro 2020";

    @BeforeMethod
    public void startDriver() throws MalformedURLException {
        String nodeURL1 = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(nodeURL1), capabilities);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
