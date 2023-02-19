package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2e {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[value='AIP']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // sau //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //select todays date
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        /*int i=1;
        while(i<5){
        driver.findElement(By.id("hrefIncAdt")).click();//4 times
        i++;
        }*/
        for (int i = 0; i <= 3; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
