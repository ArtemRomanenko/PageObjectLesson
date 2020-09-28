package com.epam.tests.UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;

public class AllegroItemPriceTest extends AbstractTest {

    @Test
    public void checkItemPrice() {
        ItemPage itemPage = new HomePage(driver)
                .getPage()
                .closeRODOBanner()
                .putSearchQuery("MacBook Pro 2020")
                .clickSearchButton()
                .clickFirstNonPromotedItem();
        String actualPrice = itemPage.getPriceOfProduct();
        Assert.assertEquals(actualPrice, "7 099,00 zł");
    }
}
