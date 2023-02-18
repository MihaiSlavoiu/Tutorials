package selenium;//https://endavace1.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096062#notes clip 43
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {
    public static void main(String[] args) throws InterruptedException {
        //Chrome Launch
//        System.setProperty("webdriver.chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// 		//Firefox Launch
// 		System.setProperty("webdriver.gecko.driver","locatia");
// 		WebDriver driver = new FirefoxDriver();
// 		//Microsoft Edge Launch
// 		System.setProperty("webdriver.edge.driver","locatia");
// 		WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // - implicit wait (wait 5 seconds)

        //driver.get("https://demoqa.com/");

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        driver.close();

        //Locators - modalitatea prin care identificam un elemnt HTML pe o pagina web
        /*ID 
        XPath 
        CSS Selector 
        name
        Class name
        Tag Name
        Link Text 
        Partial Link Text 
        
        <input type="text" placeholder="Username" id="inputUsername" value="" style=" ">
        input -> tagname
        type -> atribute
        text -> valoarea atributului*/

        driver.findElement(By.id("inputUsername")).sendKeys("Mihai");
        driver.findElement(By.name("inputPassword")).sendKeys("mihai");
        driver.findElement(By.className("signInBtn")).click();
        
        /*
        CSS
        CSS exemplu <button class="submit signInBtn" type="submit">Sign In</button>
        CSS Class name ->tagname.className -> button.signInBtn   Tagname e optional, poti scrie direct -> .className
        
        CSS exemplu <input type="text" placeholder="Username" id="inputUsername" value="" style=" ">
        CSS ID -> tagname#id -> input#inputUsername              Tagname e optional, poti scrie direct -> #id
        
        CSS general sintax
        CSS exemplu <input type="text" placeholder="Username" id="inputUsername" value="" style=" ">
        CSS Tagname[attribute = 'value']
        CSS input[placeholder='Username'] 
        CSS se mai poate scrie si Tagname[attribute = 'value']:nth-child(indexvalue) unde indexvalue este valoare indexului unde vrei sa pointezi(Child index)
        CSS sintax parentTagname childTagname ->inca o moadalitate pentru a-l scrie folosind parent-child relationship
        CSS sintax Tagname[attribute*="partialValue"] -> input[type*='pass'] -> se foloseste steluta * pentru a cauta dupa un cuvant partial
        CSS sintax Tagname
        
        CSS sintaxa cautare in consola
        CSS $('cod css')*/
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();
        
        /*
        Xpath
        Xpath sintax
        Xpath //Tagname[@attribute='value']
        Xpath se mai poate scrie si //Tagname[@attribute='value'][indexvalue] unde indexvalue este valoare indexului unde vrei sa pointezi(Child index)
        Xpath exemplu <input type="text" placeholder="Username" id="inputUsername" value="" style=" ">
        Xpath //input[@placeholder='Username']
        Xpath sintax Tagname[contains(@attribute,'partialValue')] -> //button[contains(@class,'submit')] -> se foloseste contains pentru a cauta dupa un cuvant partial
        Xpath sintax //Tagname
        Xpath sintax ->"//button[text()='Log Out']"-> pentru a-l selecta pe baza textului, la css nu merge
        
        Xpath sintaxa cautare in consola
        Xpath $x('//input[@placeholder="Username"]') - trebuie sa punem "" la stringuri, nu lasam cu '' 
        
        Xpath sintax //parentTagname/childTagname -> inca o moadalitate pentru a-l scrie folosind parent-child relationship
        Xpath - RELATIVE XPATH - se scrie cu // si se face unde vrei tu sa cauti
        Xpath - ABSOLUTE XPATH - se scrie cu / si trebuie sa incepi de la inceputul paginii gen /html/...
        */
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mihai"); //daca voiam sa il scriem in CSS era: (input[placeholder='Name'])
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Mihai@");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Mihai@");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("07...."); // - gaseste elementul cu ajutorul parent-child relationship
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mihai");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


    }
}