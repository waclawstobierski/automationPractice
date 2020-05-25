package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MyAccountSubpageTest extends  DefaultTest{

    @Test
    public void orderHistoryNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver)
                .goToOrderHistoryPage()
                .isOrderHistoryPageDisplayed());
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        orderHistoryPage.backToYourAccount();
    }

    @Test
    public void myCreditPageNavigate() {
        Assert.assertTrue(
                new DashboardPage(driver)
                .goToMyCreditPage()
                .isMyCreditPageDisplayed());
        MyCreditPage myCreditPage = new MyCreditPage(driver);
        myCreditPage.backToYourAccount();
    }

    @Test
    public void myAddressesPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver)
                .goToMyAddressesPage()
                .isMyAddressesPageDisplayed());
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.backToYourAccount();
    }

    @Test
    public void personalInfoPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver)
                .goToPersonalInfoPage()
                .isPersonalInfoPageDisplayed());
                PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver);
                personalInfoPage.backToYourAccount();
    }

    @Test
    public void wishListPageNavigate(){
        Assert.assertTrue(
                new DashboardPage(driver)
                .goToWishListPage()
                .isWishListPageDisplayed());
        WishListPage wishListPage = new WishListPage(driver);
        wishListPage.backToYourAccount();
    }
    }
