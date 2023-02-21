package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Udemy14TableSortingJavaStream {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> listaLegume = driver.findElements(By.xpath("//td[1]"));
        List<String> listaOriginala = listaLegume.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> listaSortata = listaOriginala.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(listaOriginala.equals(listaSortata));
        listaLegume.stream().map(s->getPriceOfVeggie())
    }
}
