package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.TshirtPage;

public class WishListAddItemTest extends DefaultTest {

    @Test
    public void addItemToWishList() {
        DashboardPage dashboardPage = new DashboardPage(driver, logger);
        dashboardPage.goToTshirtPage();
        TshirtPage tshirtPage = new TshirtPage(driver, logger);
        tshirtPage.viewList();
        tshirtPage.addToWishList();
        Assert.assertTrue(
                tshirtPage.isFancyBoxDisplayed()
        );
    }
}
