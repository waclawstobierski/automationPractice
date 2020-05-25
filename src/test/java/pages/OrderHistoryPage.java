package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/span[3]")
    private WebElement breadCrumb1;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")
    private WebElement backToAccountButton;



    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOrderHistoryPageDisplayed() {
        return isElementDisplayed(breadCrumb1);
    }

    public void backToYourAccount() {
        backToAccountButton.click();
    }
}
