package org.example;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {
    //driver.findElement(By.id("userEmail")).sendKeys("aaa@aaa.com");
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebElement userEmail = driver.findElement(By.id("userEmail"));
    //PageFactory-poti sa refolosesti sintaxa - //ce am facut mai sus se poate face cu Page Factory
    //Page factory se foloseste cand ai webelemente(adica cele cu driver.findElement.....)
    @FindBy(id = "userEmail")
    WebElement userEmail;

    //driver.findElement(By.id("userPassword")).sendKeys("Pass123456");
    @FindBy(id = "userPassword")
    WebElement passwordEle;

    //driver.findElement(By.id("login")).click();
    @FindBy(id = "login")
    WebElement submit;

    @FindBy(css ="[class*='flyInOut']")
    WebElement errorMessage;


    public ProductCatalog loginApplication(String email, String password) {
        userEmail.sendKeys(email);
        passwordEle.sendKeys(password);
        submit.click();
        ProductCatalog productCatalog = new ProductCatalog(driver);
        return productCatalog;
    }

    //driver.get("https://rahulshettyacademy.com/client/");
    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client/");
    }

    public String getErrorMessage(){
        waitForWebElementToAppear(errorMessage);
        return errorMessage.getText();
    }
}
