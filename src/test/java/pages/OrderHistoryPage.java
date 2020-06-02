package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr/td[6]/a")
    private WebElement invoiceButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")
    private WebElement backToAccountButton;

    public OrderHistoryPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isOrderHistoryPageDisplayed() {
        return isElementDisplayed(invoiceButton);
    }

    public void backToYourAccount() {
        backToAccountButton.click();
    }
}
