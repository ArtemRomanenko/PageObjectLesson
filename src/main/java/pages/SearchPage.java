package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='_w7z6o _uj8z7 meqh_en mpof_z0 mqu1_16 _9c44d_2vTdY']")
    List<WebElement> searchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public ItemPage clickFirstNonPromotedItem() {
        waitForVisability(searchResult.get(2));
        searchResult.get(2).click();
        return new ItemPage(driver);
    }
}
