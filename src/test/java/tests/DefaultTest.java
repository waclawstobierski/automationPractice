package tests;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import utils.BaseProperties;
import utils.CustomFile;
import utils.CustomScreenshot;
import utils.CustomTestResult;

import java.util.concurrent.TimeUnit;

public abstract class DefaultTest extends BaseProperties {

    protected static CustomFile customFile;

    protected static CustomScreenshot customScreenshot;

    protected static CustomTestResult customTestResult;

    protected static Logger logger;

    protected static WebDriver driver;
    @BeforeSuite
    public void setUp() {
        customFile = new CustomFile();
        customScreenshot = new CustomScreenshot();
        customTestResult = new CustomTestResult();
        ChromeOptions ops = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILE_PATH);
        driver = new ChromeDriver(ops);
        ops.addArguments("--disable-notifications");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            customScreenshot.makeScreenshot(driver, customTestResult.getResultScreenshotFileName(result));
        }
        }
    }

   //@AfterSuite
  //public void tearDown() {
      // driver.quit();
   // }

