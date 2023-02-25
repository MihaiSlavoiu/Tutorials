package AbstractComponents;

import org.example.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponent {
    WebDriver driver;

    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //aici tii toate codurile reutilizabile

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
    //cand ai doar By, fara driver.fin...nu poti sa folosesti Page factory
    public void waitForElementToAppear(By finfBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(finfBy));
    }

    //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
    public void waitForElementToDisappear(By ele) throws InterruptedException {
        Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(ele));
    }

    //driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
    @FindBy(css = "button[routerlink='/dashboard/cart']")
    WebElement cartHeader;

    public CartPage goToCartPage() {
        cartHeader.click();
        CartPage cartPage = new CartPage(driver);
        return cartPage;
    }
}
