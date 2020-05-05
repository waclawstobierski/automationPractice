package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseProperties {
    public WebDriver driver;

    public static String BASE_URL = "http://automationpractice.com/index.php";
    public static String LOGIN_URL = "";

    public static String BASE__USER__EMAIL = "waclaw.stobierski@gmail.com";
    public static String BASE__USER_PASSWORD = "test1234";


    public static String CHROME_DRIVER_FILE_PATH = "src/main/resources/chromedriver.exe";

    @BeforeSuite
    public void setUp() {
        ChromeOptions ops = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILE_PATH);
        driver = new ChromeDriver(ops);
        ops.addArguments("--disable-notifications");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
