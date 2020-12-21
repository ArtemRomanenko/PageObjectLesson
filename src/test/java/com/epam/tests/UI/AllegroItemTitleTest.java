package com.epam.tests.UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;

public class AllegroItemTitleTest extends AbstractTest {

    @Test
    public void checkItemTitle() {
        ItemPage itemPage = new HomePage()
                .getPage()
                .closeRODOBanner()
                .putSearchQuery(SEARCH_QUERY)
                .clickSearchButton()
                .clickFirstNonPromotedItem();
        String actualTitle = itemPage.getTitleOfProduct();
        Assert.assertEquals(actualTitle, "MacBook Pro 13 TB i5 1,4 16GB 256GB Iris645 2020");
    }

}
