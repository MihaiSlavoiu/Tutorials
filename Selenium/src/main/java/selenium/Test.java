package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/books");
        WebElement links = driver.findElement(By.cssSelector("div[class*='col-md-6']"));
        String clickOnTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        for(int i = 0;i<links.findElements(By.tagName("a")).size();i++){
            links.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
        }
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String parent = it.next();
        while(it.hasNext()){
            driver.switchTo().window(it.next());

            System.out.println(driver.getTitle());
        }
    }
}
