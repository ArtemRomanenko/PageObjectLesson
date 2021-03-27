package com.epam.tests.UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class AllegroCheckTheCartTest extends AbstractTest {

    @Test
    public void CheckCart() {
        CartPage cartPage = new HomePage()
                .getPage()
                .closeRODOBanner()
                .putSearchQuery(SEARCH_QUERY)
                .clickSearchButton()
                .clickFirstNonPromotedItem()
                .addProductToTheCart()
                .goToCart();
        Assert.assertTrue(cartPage.cartIsNotEmpty());
    }


}
