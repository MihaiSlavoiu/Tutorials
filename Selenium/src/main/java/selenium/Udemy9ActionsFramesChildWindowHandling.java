package selenium;

import java.util.Iterator;

import java.util.Set;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Udemy9ActionsFramesChildWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        //CLASS ACTIONS, FRAMES, CHILD WINDOW HANDLING
        //ACTIONS, FRAMES, CHILD WINDOW HANDLING

        //ACTIONS
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.com/");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform(); //MOUSEOVER ON SPECIFIC findElement
//        action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //CHILD WINDOWS
//        WebDriver driver1 = new ChromeDriver();
//        driver1.manage().window().maximize();
//        driver1.get("https://rahulshettyacademy.com/loginpagePractise/");
//
//
//        driver1.findElement(By.cssSelector(".blinkingText")).click();
//
//        Set<String> windows = driver1.getWindowHandles(); //[parentid,childid,subchildId]
//        Iterator<String> it = windows.iterator();
//        String parentId = it.next();
//        String childId = it.next();
//        //String subChildId = it.next();//daca ai 3 taburi deschise
//        driver1.switchTo().window(childId);
//        System.out.println(driver1.findElement(By.cssSelector(".im-para.red")).getText());
//        driver1.findElement(By.cssSelector(".im-para.red")).getText();
//        String emailId = driver1.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//
//        driver1.switchTo().window(parentId);// te duci inapoi pe pagina principala
//        driver1.findElement(By.id("username")).sendKeys(emailId);

        //FRAMES
//        WebDriver driver2 = new ChromeDriver();
//        driver2.manage().window().maximize();
//        driver2.get("https://jqueryui.com/droppable/");
//        driver2.switchTo().frame(driver2.findElement(By.cssSelector("iframe[class='demo-frame']")));
//        driver2.findElement(By.id("draggable")).click();
//        Actions a = new Actions(driver2);
//        WebElement source = driver2.findElement(By.id("draggable"));
//        WebElement target = driver2.findElement(By.id("droppable"));
//
//        a.dragAndDrop(source, target).build().perform();
//        driver2.switchTo().defaultContent();
//
//        //COUNT NUMBER OG LINKS IN A loginpagePractise
//        System.out.println(driver2.findElements(By.tagName("a")).size());

        //LINKS
        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement footerDriver = driver3.findElement(By.id("gf-BIG")); //LIMITING WEBDRIVER SCOPE
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement footerDriver1 = driver3.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul[1]"));
        System.out.println(footerDriver1.findElements(By.tagName("a")).size());

        //CLICK OK EACH LINK AND VERIFY IF THE LINKS ARE OPENING
        String clickOnLinksTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        for (int i = 1; i < footerDriver1.findElements(By.tagName("a")).size(); i++) {
            footerDriver1.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinksTab);
            Thread.sleep(5000);
        }
        Set<String> windows = driver3.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        while (iterator.hasNext()) {
            driver3.switchTo().window(iterator.next());
            System.out.println(driver3.getTitle());
        }


    }
}
