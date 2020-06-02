package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement goToDashboardButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/ul/li[3]/a/i")
    private WebElement listIcon;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div/div[3]/div/div[3]/div[1]/a")
    private WebElement addToWishlistButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/a")
    private WebElement popupCloseButton;

    @FindBy(xpath = "/html/body/div[2]/div")
    private WebElement fancyBox;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    public TshirtPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void viewList() {
        clickElement(listIcon);
    }

    public void addToWishList() {
        clickElement(addToWishlistButton);
    }

    public void closePopup() {
        clickElement(popupCloseButton);
    }

    public boolean isFancyBoxDisplayed() {
        return isElementDisplayed(fancyBox);
    }

    public void userLogout() {
        waitForElementToLoad(logoutButton);
        logoutButton.click();
    }

    public boolean isUserLoggedOut() {
        return isElementDisplayed(signInButton);
    }
}
