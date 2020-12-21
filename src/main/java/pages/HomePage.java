package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@data-role='search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@alt = 'zamknij']")
    private WebElement closeRODOButton;

    public HomePage getPage() {
        driver.get(BASE_URL);
        return this;
    }

    public HomePage closeRODOBanner() {
        waitForVisibility(closeRODOButton);
        clickAction(closeRODOButton);
        return this;
    }

    public HomePage putSearchQuery(String query) {
        jsExecutorSendText(searchField,query);
        return this;
    }

    public SearchPage clickSearchButton() {
        keyboardAction(Keys.ENTER);
        return new SearchPage();
    }
}
