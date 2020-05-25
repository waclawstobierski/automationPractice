package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CustomTestLog;

public abstract class AbstractPage {

    WebDriver driver;
    Logger logger;

    AbstractPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
        PageFactory.initElements(this.driver, this);
    }

    boolean isElementDisplayed(WebElement element) {
        logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.IS_DISPLAYED_ACTION));
        return element.isDisplayed();
    }

    void fillElement(WebElement element, String value) {
        logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.CLEAR_ACTION));
        element.clear();

        logger.info(CustomTestLog.getElementMessage(element, value, CustomTestLog.FILL_ACTION));
        element.sendKeys(value);

    }

    void clickElement(WebElement element) {
       logger.info(CustomTestLog.getElementMessage(element,CustomTestLog.CLICK_ACTION));
        element.click();
    }
}
