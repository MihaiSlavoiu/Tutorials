package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

//IMPLICIT WAIT - globaly - Wait 3 seconds befor you throw exception/nu astepta sa treaca tot daca gaseste rezultatul(nu e ok daca trebuie sa returneze multe rezultate)
//IMPLICIT WAIT sintax - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//EXPLICIT WAIT - you can target a specific element
//EXPLICIT WAIT SINTAX :  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//        //wait.until(ExpectedConditions.elementToBeClickable()) - exemplu
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));

//THRES.SLEEP - face parte din java nu selenium, cat ii dai sa asteapta atat sta, nu face mai devreme
//FLUENT WAIT

public class SynchronizationsWaits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // IMPLICIT WAIT
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
//        List<String> itemsNeeded2 = Arrays.asList("Cucumber", "Brocolli", "Beetroot");
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        //explicit wait
        //wait.until(ExpectedConditions.elementToBeClickable()) - exemplu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
//Brocolli - 1 Kg
//Brocolli,    1 kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                j++;
//click on Add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
