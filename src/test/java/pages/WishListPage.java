package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[1]/div[1]")
    private WebElement topSellersBlock;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/a[2]")
    private WebElement backToAccountButton;

    @FindBy(xpath = "//*[@id=\"wishlist_19436\"]/td[1]/a")
    private WebElement openWishListProductLink;

    public WishListPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void backToYourAccount() {
        backToAccountButton.click();
    }

    public boolean isWishListPageDisplayed() {
        return isElementDisplayed(topSellersBlock);
    }

    public void goToWishListProduct(){
        openWishListProductLink.click();
    }



}
