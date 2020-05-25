package utils;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class PageNavigator {
    private WebDriver driver;
    private Logger logger;

    public PageNavigator(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void switchTab(){
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }
}
