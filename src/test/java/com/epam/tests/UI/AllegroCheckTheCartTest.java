package com.epam.tests.UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class AllegroCheckTheCartTest extends AbstractTest {

    @Test
    public void CheckCart() {
        CartPage cartPage = new HomePage(driver)
                .getPage()
                .closeRODOBanner()
                .putSearchQuery("MacBook Pro 2020")
                .clickSearchButton()
                .clickFirstNonPromotedItem()
                .addProductToTheCart()
                .goToCart();
        Assert.assertTrue(cartPage.cartIsNotEmpty());
    }


}
