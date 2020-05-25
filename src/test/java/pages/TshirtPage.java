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


    public TshirtPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void goToDashboard(){
        goToDashboardButton.click();
    }

    public void viewList(){listIcon.click();}

    public void addToWishlist(){addToWishlistButton.click();}

    public void closePopup(){popupCloseButton.click();}

}
