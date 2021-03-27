package com.epam.tests.UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;

public class AllegroItemPriceTest extends AbstractTest {

    @Test
    public void checkItemPrice() {
        ItemPage itemPage = new HomePage()
                .getPage()
                .closeRODOBanner()
                .putSearchQuery(SEARCH_QUERY)
                .clickSearchButton()
                .clickFirstNonPromotedItem();
        String actualPrice = itemPage.getPriceOfProduct();
        Assert.assertEquals(actualPrice, "7 199,00 zł");
    }
}
