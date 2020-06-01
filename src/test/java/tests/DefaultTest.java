package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.*;

public abstract class DefaultTest extends BaseProperties {

    protected static CustomFile customFile;

    protected static CustomScreenshot customScreenshot;

    protected static CustomTestResult customTestResult;

    protected static Logger logger;

    protected static WebDriver driver;

    @Parameters({"browserType", "implicitlyWait", "windowMaximize"})
    @BeforeSuite
    public void setUp(String browserType, String implicitlyWait, String windowMaximize) {
        customFile = new CustomFile();
        customScreenshot = new CustomScreenshot();
        customTestResult = new CustomTestResult();
        driver = new CustomDriverFactory().getConfiguredDriver(
                browserType,
                Long.parseLong(implicitlyWait),
                windowMaximize.equalsIgnoreCase("true")
        );
        driver.get(BaseProperties.BASE_URL);
    }


    @BeforeClass
   public void setUpClass() {
       logger = LogManager.getLogger(this.getClass().getName());
    }
    @Parameters({"screenshot"})
    @AfterMethod
    public void tearDownMethod( ITestResult result, String screenshot) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.warn(customTestResult.getResultMessageLog(result));
            customScreenshot.makeScreenshot(driver,customTestResult.getResultScreenshotFileName(result));
        } else {
            logger.info(customTestResult.getResultMessageLog(result));
            if (screenshot.equalsIgnoreCase("true")) {
                customScreenshot.makeScreenshot(driver, customTestResult.getResultScreenshotFileName(result));
            }
        }
        }

       @AfterSuite
    public void tearDown() {
       driver.quit();
   }
}

