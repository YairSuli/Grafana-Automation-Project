package utilitiess;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public final class Listeners implements ITestListener {

    public void onStart(ITestContext execution) {
        System.out.println("---------------- Starting Execution ----------------");
    }

    public void onFinish(ITestContext execution) {
        System.out.println("---------------- Ending Execution ----------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult test) {
        System.out.println("---------------- Skipping Test: " + test.getName() + " ----------------");
    }

    public void onTestStart(ITestResult test) {
        System.out.println("---------------- Starting Test: " + test.getName() + " ----------------");
    }

    public void onTestSuccess(ITestResult test) {
        System.out.println("---------------- Test: " + test.getName() + " Passed ----------------");
    }

    public void onTestFailure(ITestResult test) {
        System.out.println("---------------- Test: " + test.getName() + " Failed ----------------");
        ITestContext context = test.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("WebDriver");
        if (driver != null) {
            saveScreenshot(driver);
        }
    }

    @Attachment(value = "page screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
