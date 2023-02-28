package TestComponents;


import Resources.ExtentReporterNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTests implements ITestListener {
    //trebuie sa faci in testng.xml lister ca sa stie de unde sa il ia
    ExtentTest test;
    ExtentReports extentReports = ExtentReporterNG.getReportObject();

    public void onTestStart(ITestResult result) { //inainte sa inceapa orice test, prima data o sa se execute asta
        test = extentReports.createTest(result.getMethod().getMethodName()); // ca sa iti arate in ce metoda incepe
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test PASSED");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());//o sa printeze mesajul in raport
        try {
            driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //screenshot, Attach to report
        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName(),driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());

    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }


}
