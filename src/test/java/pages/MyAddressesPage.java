package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressesPage extends AbstractPage{

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/a")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")
    private WebElement backToAccountButton;

    public MyAddressesPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void backToYourAccount() {
        backToAccountButton.click();
    }

    public boolean isMyAddressesPageDisplayed() {
        return isElementDisplayed(addNewAddressButton);
    }


}
