package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
    public static ExtentReports getReportObject(){
        String path = System.getProperty("use.dir") + "index.html"; //creezi un index.html unde o sa fie raportul
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setReportName("Web Automation Results");//titlul care apare in dreapta sus
        extentSparkReporter.config().setDocumentTitle("Test Results");//titlul paginii

        ExtentReports extentReport = new ExtentReports();//asta e clasa main
        extentReport.attachReporter(extentSparkReporter); //asa faci legatura
        extentReport.setSystemInfo("Tester", "Mihai");
        return extentReport;
    }
}
