package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a")
    private WebElement historyButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[2]/a")
    private WebElement myCreditButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a")
    private WebElement myAddressesButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a")
    private WebElement myPersonalInfoButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/ul/li/a")
    private WebElement myWishListButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
    private WebElement tShirtsButton;

    public DashboardPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isDashboardPageDisplayed() {
        return isElementDisplayed(logoutButton);
    }

    public OrderHistoryPage goToOrderHistoryPage() {
        clickElement(historyButton);
        return new OrderHistoryPage(driver, logger);
    }

    public MyCreditPage goToMyCreditPage() {
        clickElement(myCreditButton);
        return new MyCreditPage(driver, logger);
    }

    public MyAddressesPage goToMyAddressesPage() {
        clickElement(myAddressesButton);
        return new MyAddressesPage(driver, logger);
    }

    public PersonalInfoPage goToPersonalInfoPage() {
        clickElement(myPersonalInfoButton);
        return new PersonalInfoPage(driver, logger);
    }

    public WishListPage goToWishListPage() {
        clickElement(myWishListButton);
        return new WishListPage(driver, logger);
    }

    public TshirtPage goToTshirtPage() {
        clickElement(tShirtsButton);
        return new TshirtPage(driver, logger);
    }

    public void userLogout(){
        logoutButton.click();
    }

}
