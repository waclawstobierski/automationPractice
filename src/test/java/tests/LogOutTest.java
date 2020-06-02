package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TshirtPage;

public class LogOutTest extends DefaultTest {

    @Test
    public void logOut() {
        TshirtPage tshirtPage = new TshirtPage(driver, logger);
        tshirtPage.closePopup();
        tshirtPage.userLogout();
        Assert.assertTrue(
                tshirtPage.isUserLoggedOut()
        );
    }
}

