package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyWindowsActivities {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximizeaza pagina
        driver.get("https://rahulshettyacademy.com/locatorspractice/");//aici asteapta pana pagina e incarcata 100%
        driver.navigate().to("https://google.com/");//aici asteapta pana se incarca primul element
        driver.navigate().back();
        driver.navigate().forward();
    }
}
