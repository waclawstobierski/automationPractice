package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    WebDriver driver;

    AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    void fillElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    void clickElement(WebElement element) {
        element.click();
    }

    void waitForElementToLoad(WebElement defaultElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(defaultElement));
    }

}
