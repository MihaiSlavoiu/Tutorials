package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UdemyCalendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //select todays date

        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("its true");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }
}
