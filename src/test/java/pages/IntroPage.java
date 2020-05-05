package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IntroPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement loginButton;

    public IntroPage(WebDriver driver) {
        super(driver);
        initPageElements(driver, this);
    }

    public void openLoginForm() {
        clickElement(loginButton); }
}


