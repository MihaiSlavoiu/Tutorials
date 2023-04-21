package TemeSkillbrain;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tema1Selenium {
    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//        driver.get("https://testpages.herokuapp.com/styled/index.html");
//        String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
//        List<WebElement> firstLinks = driver.findElements(By.tagName("a"));
//
//        for (int i = 0; i < 4; i++) {
//            firstLinks.get(i).sendKeys(clickOnLink);
//        }
//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> it = window.iterator();
//        String parent = it.next();
//        String child1 = it.next();
//        String child2 = it.next();
//        String child3 = it.next();
//        String child4 = it.next();
//
//        driver.switchTo().window(child1);
//        System.out.println(driver.findElement(By.className("explanation")).getText());
//        System.out.println(driver.findElement(By.id("para1")).getText());
//        System.out.println(driver.findElement(By.id("para2")).getText());
//
//        driver.switchTo().window(child2);
//        System.out.println(driver.findElement(By.xpath("//div[@class='explanation']/p")).getText());
//        System.out.println(driver.findElement(By.id("jsattributes")).getAttribute("nextid"));
//        driver.findElement(By.className("styled-click-button")).click();
//        System.out.println(driver.findElement(By.id("jsattributes")).getAttribute("nextid"));
//
//        driver.switchTo().window(child3);
//        System.out.println(driver.findElement(By.xpath("//div[@class='specialDiv']/p[2]")).getText());
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)");
//
//        WebElement links = driver.findElement(By.className("specialDiv"));
//        List<WebElement> linksToCLick = links.findElements(By.tagName("a"));
//        for (int i = 0; i < linksToCLick.size(); i++) {
//            String linksToVerify = linksToCLick.get(i).getText();
//            if (linksToVerify == "jump to para 18") {
//                links.click();
//            }
//        }
//
//        driver.switchTo().window(child4);
//        System.out.println(driver.findElement(By.cssSelector("div[class='explanation'] p")).getText());
//
//        List<WebElement> values = driver.findElements(By.cssSelector("table[id='mytable'] td:nth-child(2)"));
//        double sum = 0;
//        for (int i = 0; i < values.size(); i++) {
//            sum = sum + Double.parseDouble(values.get(i).getText());
//
//        }
//        System.out.println(sum);
//
//        List<WebElement> names = driver.findElements(By.cssSelector("table[id='mytable'] td:nth-child(1)"));
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("Lista initiala : " + names.get(i).getText());
//        }
//        names.sort(Comparator.comparing(WebElement::getText));
//        //names.sort(Comparator.comparing(item -> item.getText()));
//        names.stream().forEach(item -> System.out.println("Prima sortare : " + item.getText()));
//
//        List<String> sortedNames = names.stream()
//                .map(WebElement::getText)
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println("A doua sortare");
//        System.out.println(sortedNames);
//
//        driver.switchTo().window(parent);
//        driver.quit();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver1 = new ChromeDriver(options);
        driver1.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
        driver1.get("https://demoqa.com/elements");
        driver1.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();

        //Locator for Full Name Input Field:
        driver1.findElement(By.xpath("//input[@id='userName']")).sendKeys("Mihai");
        //driver1.findElement(By.cssSelector("input[id='userName']"));

        //Locator for Email Input Field:
        driver1.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("mihai@mihai.ro");
        //driver1.findElement(By.cssSelector("input[id='userEmail']"));

        //Locator for Current Address Input Field:
        driver1.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pitesti");
        //driver1.findElement(By.cssSelector("textarea[id='currentAddress']"));

        //Locator for Permanent Address Input Field:
        driver1.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Pitesti");
        //driver1.findElement(By.cssSelector("textarea[id='permanentAddress']"));

        //Locator for Submit Button:
        WebElement submit = driver1.findElement(By.xpath("//button[@id='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        //  driver1.findElement(By.cssSelector("button[id='submit']"));

        driver1.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();

        //Locator for "Home" Checkbox:

        driver1.findElement(By.xpath("//span[text()='Home']//preceding-sibling::div[@class='rct-checkbox']//input"));
        // By.cssSelector("input[type='checkbox'][value='home']");

        //Locator for "Desktop" Checkbox:
        driver1.findElement(By.xpath("//span[text()='Desktop']//preceding-sibling::div[@class='rct-checkbox']//input"));
        //By.cssSelector("input[type='checkbox'][value='desktop']");

        //Locator for "Notes" Checkbox:
        driver1.findElement(By.xpath("//span[text()='Notes']//preceding-sibling::div[@class='rct-checkbox']//input"));
        //By.cssSelector("input[type='checkbox'][value='notes']");

        //Locator for "Commands" Checkbox:
        driver1.findElement(By.xpath("//span[text()='Commands']//preceding-sibling::div[@class='rct-checkbox']//input"));
        //By.cssSelector("input[type='checkbox'][value='commands']");

        //Locator for "Documents" Checkbox:
        driver1.findElement(By.xpath("//span[text()='Documents']//preceding-sibling::div[@class='rct-checkbox']//input"));
        //By.cssSelector("input[type='checkbox'][value='documents']")

        driver1.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']")).click();

        // Locator for "Yes" Radio Button:
        driver1.findElement(By.xpath("//label[text()='Yes']//preceding-sibling::input[@type='radio']"));
        //By.cssSelector("input[type='radio'][value='yes']");

        //Locator for "Impressive" Radio Button:
        driver1.findElement(By.xpath("//label[text()='Impressive']//preceding-sibling::input[@type='radio']"));
        //By.cssSelector("input[type='radio'][value='impressive']");

        //Locator for "No" Radio Button:
        driver1.findElement(By.xpath("//label[text()='No']//preceding-sibling::input[@type='radio']"));
        //By.cssSelector("input[type='radio'][value='no']")

        //Locator for "Good" Radio Button:
        driver1.findElement(By.xpath("//label[text()='Good']//preceding-sibling::input[@type='radio']"));
        //By.cssSelector("input[type='radio'][value='good']");

        //Locator for "Not Now" Radio Button:
        driver1.findElement(By.xpath("//label[text()='Not Now']//preceding-sibling::input[@type='radio']"));
        //By.cssSelector("input[type='radio'][value='notnow']")

        driver1.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']")).click();

        //Locator for First Name Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='firstName']"));
        //By.cssSelector("input[id='firstName']")

        //Locator for Last Name Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='lastName']"));
        //By.cssSelector("input[id='lastName']")

        //Locator for Email Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='userEmail']"));
        //By.cssSelector("input[id='userEmail']")

        //Locator for Age Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='age']"));
        //By.cssSelector("input[id='age']")

        //Locator for Salary Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='salary']"));
        //By.cssSelector("input[id='salary']")

        //Locator for Department Input Field in Add New Record Form:
        driver1.findElement(By.xpath("//input[@id='department']"));
        //By.cssSelector("input[id='department']")

        //Locator for "Search" Box:
        driver1.findElement(By.xpath("//input[@type='search']"));
        //By.cssSelector("input[type='search']")

        //Locator for "Next" Button in Pagination:
        driver1.findElement(By.xpath("//a[@id='next']"));
        //By.cssSelector("a[id='next']")

        //Locator for "Last Name" Column Header:
        driver1.findElement(By.xpath("//span[text()='Last Name']"));
        //By.cssSelector("span:contains('Last Name')")
    }
}
