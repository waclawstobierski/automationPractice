package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class PageNavigator {
    private WebDriver driver;

    public PageNavigator(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void switchTab(){
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }
}
