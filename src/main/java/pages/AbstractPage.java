package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import service.TestDataReader;

public class AbstractPage {

    protected WebDriver driver;
    protected int WAIT_FOR_ELEMENT_TIME = 10;
    protected Actions actions;
    protected JavascriptExecutor jsExecutor;
    protected String BASE_URL = TestDataReader.getTestData("base.url");

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
        actions = new Actions(driver);
        jsExecutor = (JavascriptExecutor) driver;
    }

    public void waitForVisibility(WebElement element) {
        new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIME)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickAction(WebElement locator) {
        actions.moveToElement(locator)
                .click()
                .build()
                .perform();
    }

    public void keyboardAction(Keys keys) {
        actions.sendKeys(keys)
                .build()
                .perform();
    }

    public String jsGetValue(WebElement locator) {
        return jsExecutor.executeScript("return arguments[0].innerHTML;", locator).toString();

    }

    public void jsExecutorSendText(WebElement locator, String text) {
        jsExecutor.executeScript("arguments[0].value = '" + text + "'", locator);

    }
}
