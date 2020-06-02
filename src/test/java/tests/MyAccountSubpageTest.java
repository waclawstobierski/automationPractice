package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.Date;

public class MyAccountSubpageTest extends DefaultTest {

    @Test
    public void orderHistoryNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                        .goToOrderHistoryPage()
                        .isOrderHistoryPageDisplayed());
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "ORDERHISTORY PAGE SCREEN");
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver, logger);
        orderHistoryPage.backToYourAccount();
    }

    @Test
    public void myCreditPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                        .goToMyCreditPage()
                        .isMyCreditPageDisplayed());
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "MYCREDIT PAGE SCREEN");
        MyCreditPage myCreditPage = new MyCreditPage(driver, logger);
        myCreditPage.backToYourAccount();
    }

    @Test
    public void myAddressesPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                        .goToMyAddressesPage()
                        .isMyAddressesPageDisplayed());
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "ADDRESSES PAGE SCREEN");
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver, logger);
        myAddressesPage.backToYourAccount();
    }

    @Test
    public void personalInfoPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                        .goToPersonalInfoPage()
                        .isPersonalInfoPageDisplayed());
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "PERSONAL INFO PAGE SCREEN");
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver, logger);
        personalInfoPage.backToYourAccount();
    }

    @Test
    public void wishListPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver, logger)
                        .goToWishListPage()
                        .isWishListPageDisplayed());
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "WISHLIST PAGE SCREEN");
        WishListPage wishListPage = new WishListPage(driver, logger);
        wishListPage.backToYourAccount();
    }
}
