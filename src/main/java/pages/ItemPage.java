package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//h1[1]")
    private WebElement titleOfItem;

    @FindBy(xpath = "//div[@class='_1svub _lf05o _9a071_2MEB_']")
    private WebElement priceOfItem;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'przejdź do koszyka')]")
    private WebElement goToCartButton;

    public String getTitleOfProduct() {
        waitForVisibility(titleOfItem);
        return jsGetValue(titleOfItem);
    }

    public String getPriceOfProduct() {
        waitForVisibility(priceOfItem);
        return priceOfItem.getText();
    }

    public ItemPage addProductToTheCart() {
        addToCartButton.click();
        return this;
    }

    public CartPage goToCart() {
        waitForVisibility(goToCartButton);
        goToCartButton.click();
        return new CartPage();
    }
}
