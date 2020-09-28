package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@data-role='search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@alt = 'zamknij']")
    private WebElement closeRODOBanner;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage getPage() {
        driver.get("https://allegro.pl/");
        return this;
    }

    public HomePage closeRODOBanner() {
        waitForVisibility(closeRODOBanner);
        closeRODOBanner.click();
        return this;
    }

    public HomePage putSearchQuery(String query) {
        searchField.sendKeys(query);
        return this;
    }

    public SearchPage clickSearchButton() {
        searchButton.click();
        return new SearchPage(driver);
    }
}
