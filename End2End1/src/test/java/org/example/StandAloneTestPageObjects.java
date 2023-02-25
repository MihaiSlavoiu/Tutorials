package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

//aaa@aaa.com Pass123456
//clasa 1 - StandAloneTest - in package test
//aici e un test complet end 2 end
public class StandAloneTestPageObjects {
    public static void main(String[] args) throws InterruptedException {
        String productName = "ZARA COAT 3";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();

        ProductCatalog productCatalog = landingPage.loginApplication("aaa@aaa.com", "Pass123456");
        List<WebElement> products = productCatalog.getProductList();
        productCatalog.addProductToCart(productName);

        CartPage cartPage = productCatalog.goToCartPage();
        Boolean match = cartPage.verifyProductDisplay(productName);
        Assert.assertTrue(match);
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationPage =checkoutPage.submitOrder();

        String confirmation =confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmation.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
        driver.close();
    }
}
