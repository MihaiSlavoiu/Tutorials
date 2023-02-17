package automatizare.mihai;


import com.beust.jcommander.Strings;
import graphql.language.SelectionSet;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
//import org.apache.commons. FileUtils;

import java.io.File;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class delazero {
    public static void main(String[] args) throws InterruptedException {
        //Explore Chrome options to set proxies,plugins & paths on Chrome browser
        //de exemplu daca vrei sa i pui extensii:
        ChromeOptions option=new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        //option.addExtensions()//pui extensia si calea catre ea si cand va deschide chrome, o sa deschida si extensia
        //CA SA PUI PROXY:
        Proxy proxy=new Proxy();
        proxy.setHttpProxy("ipadress:4444");
        option.setCapability("proxy", proxy);

        //Block pop-up windows
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",
        Arrays.asList("disable-popup-blocking"));

        //Set download directory
     //desters commentul   ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");

        //din astea cel ami mult se foloseste proxy si ssl certificates.

        options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://expire.badssl.com/");
        System.out.println(driver.getTitle());

        //HOW TO MAXIMIZE THE BROWER AND DELETE COOKIES
        System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        //desters commentul   WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("cookie");

        //HOW TO TAKE A SCREENSHOT
        System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        //desters commentul  WebDriver driver = new ChromeDriver(option);
        driver.get("google.com");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//first we are casting our driver to take screenshot
        //FileUtils.//daca nu se importa automat o importi tu in partea de sus cu: import org.apache.common.io.FileUtils;
        }
          }


