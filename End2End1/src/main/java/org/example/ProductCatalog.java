package org.example;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCatalog extends AbstractComponent {
    //driver.findElement(By.id("userEmail")).sendKeys("aaa@aaa.com");
    WebDriver driver;

    public ProductCatalog(WebDriver driver) {
        super(driver);
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
    @FindBy(css = ".mb-3")
    List<WebElement> products;

    By productBy = By.cssSelector(".mb-3");
    By addToCart = By.cssSelector(".btn.w-10.rounded");
    By toastMessege = By.cssSelector("#toast-container");
    By elementToDiasppear = By.cssSelector(".ng-animating");

    public List<WebElement> getProductList() {
        waitForElementToAppear(productBy);
        return products;
    }

    //WebElement prod = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
    public WebElement getProductByName(String productName) {
        WebElement prod = getProductList().stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        return prod;
    }

    //prod.findElement(By.cssSelector(".btn.w-10.rounded")).click();
    public void addProductToCart(String productName) throws InterruptedException {
        WebElement prod = getProductByName(productName);
        prod.findElement(addToCart).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        waitForElementToAppear(toastMessege);

        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
        waitForElementToDisappear(elementToDiasppear);


    }
}
