package org.example;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends AbstractComponent {
    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //String confirmation = driver.findElement(By.cssSelector(".hero-primary")).getText();
    @FindBy(css = ".hero-primary")
    WebElement confirmationMesseage;
    public String getConfirmationMessage(){
        return confirmationMesseage.getText();
    }
}
