package automatizare.mihai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class numerge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        Select s=new Select(driver.findElement(By.cssSelector("[id='dropdown-class-example']"))); //La Select trebuie sa pui in paranteza locatia unde sa caute(By.cssSelector...sau By,id...)
        //poti alege optiunile astea doar daca ai tagName select
        s.selectByValue("option3");
        s.selectByIndex(2);
        s.selectByVisibleText("Option1");
    }
}