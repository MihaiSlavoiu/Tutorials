package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Udemy6Store {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(2000);

        //PENTRU UN SINGUR PRODUS
        List<WebElement> productsName = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < productsName.size(); i++) {
            String name = productsName.get(i).getText();
            if (name.contains("Carrot")) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }

        //PENTRU MAI MULTE PRODUSE

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
//        List<String> itemsNeeded2 = Arrays.asList("Cucumber", "Brocolli", "Beetroot");
        addItems(driver, itemsNeeded);

        //PENTRU MAI MULTE PRODUSE
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
