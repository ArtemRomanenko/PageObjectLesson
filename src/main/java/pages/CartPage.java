package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='_1yyhi _sizcr']")
    List<WebElement> itemsInTheCart;

    public Boolean cartIsNotEmpty() {
        waitForVisibility(itemsInTheCart.get(0));
        return itemsInTheCart.size() == 1;
    }


}
