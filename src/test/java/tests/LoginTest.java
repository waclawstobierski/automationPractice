package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.IntroPage;
import pages.LoginPage;
import utils.BaseProperties;
import utils.PageNavigator;

public class LoginTest extends BaseProperties {

    @Test
    public void initializationTest() {
        new PageNavigator(driver).navigateTo(BASE_URL);
        IntroPage introPage = new IntroPage(driver);
        introPage.openLoginForm();
    }

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                new LoginPage(driver)
                        .fillLoginForm(
                                BaseProperties.BASE__USER__EMAIL,
                                BaseProperties.BASE__USER_PASSWORD
                        )
                        .submitLoginForm()
                        .isDashboardPageDisplayed());
    }

    @Test
    public void logOut() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.userLogout();

    }
}
