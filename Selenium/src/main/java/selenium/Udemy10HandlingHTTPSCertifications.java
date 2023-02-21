package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Udemy10HandlingHTTPSCertifications {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
//options.addExtensions("aici pui locatia extensiei pe care o descarci ca fisier");//daca vrei sa ii pui o extensie
//Proxy proxy = new Proxy();
//proxy.SetHttpProxy("proxy string ex:ipadress:4444")
//options.setCapability("proxy",proxy);//daca vrei sa ii setezi un anumit proxy la deschidere
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

//daca vrei sa schimbi folserul unde downloadezi ceva :
// Map<String, Object> prefs = new HashMap<String, Object>();
// prefs.put("download.default_directory", "/directory/path");
// options.setExperimentalOption("prefs", prefs);
    }
}
