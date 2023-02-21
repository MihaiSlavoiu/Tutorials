package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Udemy4Handlings {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //HANDLING STATIC DROPDOWNS - with select tab
//        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(3);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());

        //HANDLING STATIC DROPDOWNS 2
//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//        /*int i=1;
//        while(i<5){
//        driver.findElement(By.id("hrefIncAdt")).click();//4 times
//        i++;
//        }*/
//        for (int i = 0; i <= 3; i++) {
//            driver.findElement(By.id("hrefIncAdt")).click();
//        }
//        //driver.findElement(By.id("hrefIncAdt")).click(); // aici baga doar 1 adult in plus
//        driver.findElement(By.id("btnclosepaxoption")).click();
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //HANDLING DYNAMIC DROPDOWNS
//        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[value='AIP']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // sau //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] - parent relationship xpath, pui spatiu intre xpath uri

        //HANDLING AUTOSUGGESTIVE DROPDOWNS
//        driver.findElement(By.id("autosuggest")).sendKeys("ind");
//        Thread.sleep(2000);
//        List<WebElement> dropdownOptions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//        for (WebElement option : dropdownOptions) {
//            if (option.getText().equals("India")) {
//                option.click();
//                break;
//            }
//        }

        //HANDLING CHECKBOX AND SIZE OF THEM
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.manage().deleteAllCookies(); // ca sa stergi toate cookieurile
        driver.manage().deleteCookieNamed("nume cookie"); //ca sa stergi doar un anumit cookie
    }
}
