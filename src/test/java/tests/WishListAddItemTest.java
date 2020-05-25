package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.TshirtPage;

public class WishListAddItemTest extends DefaultTest {

@Test
    public void addItemToWishList(){
    DashboardPage dashboardPage = new DashboardPage(driver);
    dashboardPage.goToTshirtPage();
    TshirtPage tshirtPage = new TshirtPage(driver);
    tshirtPage.viewList();
    tshirtPage.addToWishlist();
    tshirtPage.closePopup();
}
}