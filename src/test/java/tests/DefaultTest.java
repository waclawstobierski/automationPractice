package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.*;

import java.lang.reflect.Method;
import java.util.Date;

public abstract class DefaultTest extends BaseProperties {

    protected static CustomFile customFile;

    protected static CustomScreenshot customScreenshot;

    protected static CustomTestResult customTestResult;

    protected static Logger logger;

    protected static WebDriver driver;

    protected static ExtentReports extentReports;
    protected static ExtentTest extentTest;

    @Parameters({"browserType", "implicitlyWait", "windowMaximize"})
    @BeforeSuite
    public void setUp(String browserType, String implicitlyWait, String windowMaximize) {
        customFile = new CustomFile();
        customScreenshot = new CustomScreenshot();
        customTestResult = new CustomTestResult();

        extentReports = new ExtentReports(
                CustomFile.getProjectPath() +
                        BaseProperties.REPORTS_DIRECTORY_NAME +
                        new Date().getTime() + "_report.html", false);

        extentReports.addSystemInfo("Test type", "Regression");

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

    @BeforeMethod
    public void setUpMethod(Method method) {
        extentTest = extentReports.startTest(method.getName());
    }

    @Parameters({"screenshot"})
    @AfterMethod
    public void tearDownMethod(ITestResult result, String screenshot) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.warn(customTestResult.getResultMessageLog(result));
            extentTest.log(LogStatus.FAIL, result.getMethod().getMethodName());
            customScreenshot.makeScreenshot(driver, customTestResult.getResultScreenshotFileName(result));
        } else {
            logger.info(customTestResult.getResultMessageLog(result));
            if (result.getStatus() == ITestResult.SUCCESS) {
                extentTest.log(LogStatus.PASS, result.getMethod().getMethodName());
            } else if (result.getStatus() == ITestResult.SKIP) {
                extentTest.log(LogStatus.SKIP, result.getMethod().getMethodName());
            } else {
                extentTest.log(LogStatus.UNKNOWN, result.getMethod().getMethodName());
            }
            if (screenshot.equalsIgnoreCase("true")) {
                customScreenshot.makeScreenshot(driver, customTestResult.getResultScreenshotFileName(result));
            }
        }
        extentReports.endTest(extentTest);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
        extentReports.flush();
        extentReports.close();
    }
}

