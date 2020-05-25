package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.IntroPage;
import pages.LoginPage;
import utils.BaseProperties;
import utils.PageNavigator;

import java.util.Date;

public class LoginTest extends DefaultTest {

    @BeforeTest
    public void WebInitialization() {
        new PageNavigator(driver,logger).navigateTo(BASE_URL);
        IntroPage introPage = new IntroPage(driver,logger);
        introPage.openLoginForm();
    }

    @Test
    public void successLoginTest() {

        LoginPage loginPage = new LoginPage(driver, logger)
                .fillLoginForm(
                        BaseProperties.BASE__USER__EMAIL,
                        BaseProperties.BASE__USER_PASSWORD);
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest() {
                        }.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 1 - FILL_LOGIN_FORM");

        Assert.assertTrue(
                loginPage.submitLoginForm()
                        .isDashboardPageDisplayed());
    }
}

    //@AfterTest
    //public void logOut(){
     //   DashboardPage dashboardPage = new DashboardPage(driver);
    //    dashboardPage.userLogout();
   // }
   // }
