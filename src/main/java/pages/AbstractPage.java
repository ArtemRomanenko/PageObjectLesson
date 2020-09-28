package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

    protected WebDriver driver;
    protected int WAIT_FOR_ELEMENT_TIME = 10;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForVisability(WebElement element) {
        new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIME).until(ExpectedConditions.visibilityOf(element));
    }
}
