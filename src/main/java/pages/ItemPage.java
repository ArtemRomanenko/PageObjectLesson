package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='_9a071_1Ux3M _9a071_3nB-- _9a071_1R3g4 _9a071_1S3No']")
    private WebElement titleOfItem;

    @FindBy(xpath = "//div[@class='_1svub _lf05o _9a071_2MEB_']")
    private WebElement priceOfItem;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@class = '_13q9y _8tsq7 munh_56_s']")
    private WebElement goToCartButton;


    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleOfProduct() {
        waitForVisibility(titleOfItem);
        return titleOfItem.getText();
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
        return new CartPage(driver);
    }
}
