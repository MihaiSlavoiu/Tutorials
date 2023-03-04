package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy18AutomatingWindowControls {
    //Authentication Login Pop Up
    //https://Username:Password@SiteURL
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://the-internet.herokuapp.com/");
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();


    }


}
