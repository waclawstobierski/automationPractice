package pages;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage{

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")
    private WebElement registerButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")
    private WebElement submitButton;

    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }


    public LoginPage fillLoginForm(String email, String password){
        fillElement(emailField, email);
        fillElement(passwordField, password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        clickElement(submitButton);
        return new DashboardPage(driver, logger);
    }
}
