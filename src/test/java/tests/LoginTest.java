package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseProperties;

import java.util.Date;

public class LoginTest extends DefaultTest {

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
