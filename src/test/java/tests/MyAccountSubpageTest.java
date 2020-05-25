package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MyAccountSubpageTest extends  DefaultTest{


    @Test
    public void orderHistoryNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                .goToOrderHistoryPage()
                .isOrderHistoryPageDisplayed());
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver, logger);
        orderHistoryPage.backToYourAccount();
    }

    @Test
    public void myCreditPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                .goToMyCreditPage()
                .isMyCreditPageDisplayed());
        MyCreditPage myCreditPage = new MyCreditPage(driver, logger);
        myCreditPage.backToYourAccount();
    }

    @Test
    public void myAddressesPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                .goToMyAddressesPage()
                .isMyAddressesPageDisplayed());
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver, logger);
        myAddressesPage.backToYourAccount();
    }

    @Test
    public void personalInfoPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                .goToPersonalInfoPage()
                .isPersonalInfoPageDisplayed());
                PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver, logger);
                personalInfoPage.backToYourAccount();
    }

    @Test
    public void wishListPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                .goToWishListPage()
                .isWishListPageDisplayed());
        WishListPage wishListPage = new WishListPage(driver, logger);
        wishListPage.backToYourAccount();
    }
    }
