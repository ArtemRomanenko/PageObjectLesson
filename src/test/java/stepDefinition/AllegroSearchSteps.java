package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.ItemPage;
import pages.SearchPage;

public class AllegroSearchSteps {
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ItemPage itemPage = new ItemPage();

    @Given("I open allegro home page")
    public void iOpenAllegroHomePage() {
        homePage.getPage();
    }

    @Given("I'm closing RODO banner")
    public void iMClosingRODOBanner() {
        homePage.closeRODOBanner();
    }

    @And("I provide searching {string}")
    public void iProvideSearching(String searchQuery) {
        homePage.putSearchQuery(searchQuery);
    }

    @And("I click search button")
    public void iClickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("I select first non-promoted item")
    public void iSelectFirstNonPromotedItem() {
        searchPage.clickFirstNonPromotedItem();
    }

    @Then("Item price should be {string}")
    public void itemPriceShouldBe(String price) {
        String actualPrice = itemPage.getPriceOfProduct();
        Assert.assertEquals(actualPrice, price);
    }
}
