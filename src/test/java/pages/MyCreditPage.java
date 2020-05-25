package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCreditPage extends AbstractPage {

    private String creditText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/span[3]")).getText();

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")
    private WebElement backToAccountButton;

    public MyCreditPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void backToYourAccount() {
        backToAccountButton.click();
    }

    public boolean isMyCreditPageDisplayed(){
        String expectedCreditText = "Credit slips";
        return
        creditText.equals(expectedCreditText);
    }
}
