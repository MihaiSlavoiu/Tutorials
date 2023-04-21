package SkillBrain.Capitol32;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.dedeman.ro/");
        driver.manage().window().maximize();
        //js.executeScript("window.scrollBy(0,500)");
//       driver.findElement(By.linkText("Citeste aici")).click();

      //  Assert.assertEquals(driver.getTitle(),"Electronice si electrocasnice online la cel mai mic pret");
       // js.executeScript("window.scrollBy(0,5000)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//ul[@class='inline-list header-actions-list']/li[1]"))).build().perform();
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }
}
