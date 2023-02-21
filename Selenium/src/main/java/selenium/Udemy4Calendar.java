package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Udemy4Calendar {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//        Thread.sleep(2000);
//        driver.findElement(By.className("ui-datepicker-trigger")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //select todays date
//
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
//            System.out.println("its true");
//            Assert.assertTrue(true);
//        } else {
//            Assert.assertTrue(false);
//        }


        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.path2usa.com/travel-companions");
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeScript("window.scrollBy(0,1200)");

        Thread.sleep(2000);
//April 21
        driver1.findElement(By.id("form-field-travel_comp_date")).click();


        while (!driver1.findElement(By.className("cur-month")).getText().contains("April")) {
            driver1.findElement(By.className("flatpickr-next-month")).click();
        }


        List<WebElement> dates = driver1.findElements(By.cssSelector(".flatpickr-day"));
//Grab common attribute//Put into list and iterate
        int count = driver1.findElements(By.cssSelector(".flatpickr-day")).size();

        for (int i = 0; i < count; i++) {
            String text = driver1.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
            if (text.equalsIgnoreCase("21")) {
                driver1.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
                break;
            }
        }
    }
}
