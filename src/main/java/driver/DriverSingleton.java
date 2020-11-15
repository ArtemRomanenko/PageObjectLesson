package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import service.TestDataReader;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverSingleton {
    private static String GRID_HUB = TestDataReader.getTestData("grid.hub");
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                driver = new RemoteWebDriver(new URL(GRID_HUB), DriverBuilder
                        .getCapability(System.getProperty("browser")));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
