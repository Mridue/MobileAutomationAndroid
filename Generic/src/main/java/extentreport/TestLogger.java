package extentreport;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import static base.MobileAPI.extent;

/**
 * Created by mrahman on 05/13/17.
 */

public class TestLogger {

    public static void log(final String message) {
        Reporter.log(message, true);
        extentreport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final StringUtils message) {
        Reporter.log(message + "<br>", true);
        extentreport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final String message, WebDriver driver) {
        Reporter.log(message + "<br>", true);
        extentreport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }


}
