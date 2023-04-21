package TemeSkillbrain;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class Tema2Selenium {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            // Set up Chrome driver
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications"); // Disable notifications
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

            // Test case 1: Alerts section
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            try {
                WebElement element = driver.findElement(By.id("non-existent-element")); // try to locate an element that does not exist on the page

                WebElement showAlertBox = driver.findElement(By.id("alertexamples"));
                showAlertBox.click();
                driver.switchTo().alert().accept();

                WebElement showConfirmBox = driver.findElement(By.id("confirmexample"));
                showConfirmBox.click();
                driver.switchTo().alert().dismiss();
                String responseShowConfirmBox = driver.findElement(By.id("confirmexplanation")).getText();
                Assert.assertEquals(responseShowConfirmBox,"You clicked Cancel, confirm returned false.");

                WebElement showPromtBox = driver.findElement(By.id("promptexample"));
                showConfirmBox.click();
                driver.switchTo().alert().sendKeys("SkillBrain");
                String responseShowPromtBox = driver.findElement(By.id("promptexplanation")).getText();
                Assert.assertEquals(responseShowPromtBox,"You clicked OK. 'prompt' returned skillbrian");

            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "alert-section.png");
            }

            // Test case 2: HTML Forms Example section
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            try {
                WebElement element = driver.findElement(By.id("non-existent-element")); // try to locate an element that does not exist on the page

                // fill out the form and submit it
                driver.findElement(By.name("username")).sendKeys("testuser");
                driver.findElement(By.name("password")).sendKeys("testpassword");
                driver.findElement(By.name("comments")).sendKeys("This is a test comment.");
                Select select = new Select(driver.findElement(By.name("dropdown")));
                select.selectByValue("dd1");
                driver.findElement(By.cssSelector("input[type='checkbox'][value='cb1']")).click();
                driver.findElement(By.cssSelector("input[type='radio'][value='rd2']")).click();
                driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "html-forms.png");
            }

            // Test case 3: Browser Windows section
            driver.get("https://demoqa.com/browser-windows");
            try {
                WebElement element = driver.findElement(By.id("non-existent-element")); // try to locate an element that does not exist on the page

            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "browser-windows.png");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(filename);
        FileUtils.copyFile(screenshotFile, destFile);
    }
}
