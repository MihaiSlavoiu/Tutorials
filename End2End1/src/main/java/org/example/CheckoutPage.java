package org.example;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends AbstractComponent {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "India").build().perform();

    @FindBy(css = "[placeholder='Select Country']")
    WebElement country;

    //driver.findElement(By.cssSelector(".actions [class*='btnn']")).click();
    @FindBy(css = ".actions [class*='btnn']")
    WebElement submit;


    //driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
    @FindBy(css = ".ta-item:nth-of-type(2)")
    WebElement selectCountry;

    By results=By.cssSelector("[class*='ta-result']");

    public void selectCountry(String countryName) {
        Actions a = new Actions(driver);
        a.sendKeys(country, "India").build().perform();
        waitForElementToAppear(results);
        selectCountry.click();
    }

    //driver.findElement(By.cssSelector(".actions [class*='btnn']")).click();
     WebElement submitOrder;
    public ConfirmationPage submitOrder(){
        submit.click();
        return new ConfirmationPage(driver);
    }
}
