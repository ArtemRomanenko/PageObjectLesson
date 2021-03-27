package com.epam.tests.UI;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import service.TestDataReader;
import testListener.TestListener;

@Listeners({TestListener.class})
public class AbstractTest {

    protected WebDriver driver;
    protected String SEARCH_QUERY = TestDataReader.getTestData("search.query");

    @AfterMethod
    public void closeBrowser() {
        DriverSingleton.closeDriver();
    }
}
