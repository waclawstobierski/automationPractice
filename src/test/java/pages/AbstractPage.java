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
    }

    void initPageElements(WebDriver driver, Object page) {
        PageFactory.initElements(driver, page);
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

    void selectCheckbox(WebElement element, boolean checked) {
        if (!element.isSelected()) {
            if (checked) {
                element.click();
            }
        } else {
            if (!checked) {
                element.click();
            }
        }
    }

    void waitForElementToLoad(WebElement defaultElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(defaultElement));
    }

}
