package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReport {
    //bagi extentreport in maven
    ExtentReports extentReport;//o declari global sa o poti folosi in metode

    @BeforeTest
    public void config() {
        //ExtentReports  , ExtentSparkReporter
        String path = System.getProperty("use.dir") + "index.html"; //creezi un index.html unde o sa fie raportul
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setReportName("Web Automation Results");//titlul care apare in dreapta sus
        extentSparkReporter.config().setDocumentTitle("Test Results");//titlul paginii

        extentReport = new ExtentReports();//asta e clasa main
        extentReport.attachReporter(extentSparkReporter); //asa faci legatura
        extentReport.setSystemInfo("Tester", "Mihai");
    }

//    @Test //test pozitiv
//    public void initial() {
//        extentReport.createTest("Demo");//asta trebuie sa treci la fiecare test ca sa ste sa l includa in raport
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        System.out.println(driver.getTitle());
//        extentReport.flush();//anunta ca testul se opreste, se scrie la sfarsit
//    }

    //dupa ce dai run copiezi path ul din index.html pe care l a generat si il deschizi in chrome

    @Test //test negativ
    public void initial() {
        ExtentTest test = extentReport.createTest("Demo");//asta trebuie sa treci la fiecare test ca sa ste sa l includa in raport
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();
        test.fail("Result do not match");
        extentReport.flush();//anunta ca testul se opreste, se scrie la sfarsit

    }
}
