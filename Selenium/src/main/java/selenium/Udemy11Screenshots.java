package selenium;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Udemy11Screenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File ("D:\\poza.png");
        FileUtils.copyFile(src,destFile);
    }
}
