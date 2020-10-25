package com.epam.tests.UI;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import service.TestDataReader;
import testListener.TestListener;

@Listeners({TestListener.class})
public class AbstractTest {

    protected WebDriver driver;
    protected String SEARCH_QUERY = TestDataReader.getTestData("search.query");

    @BeforeMethod
    public void startDriver() {
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
