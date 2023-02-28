package org.example;

import TestComponents.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//aaa@aaa.com Pass123456
//clasa 1 - StandAloneTest - in package test
//aici e un test complet end 2 end
public class ErrorValidationsTest extends BaseTests {

    @Test(groups = {"ErrorHandling"})
    public void LoginErrorValidation() throws IOException, InterruptedException {
        String productName = "ZARA COAT 3";
        ProductCatalog productCatalog = landingPage.loginApplication("aaa@aaa.com", "Pass123a456");
        Assert.assertEquals("Incorrect email  password.",landingPage.getErrorMessage());
    }

    @Test
    public void ProductErrorValidation() throws IOException, InterruptedException {
        String productName = "ZARA COAT 3";
        ProductCatalog productCatalog = landingPage.loginApplication("aaa@aaa.com", "Pass123456");
        List<WebElement> products = productCatalog.getProductList();
        productCatalog.addProductToCart(productName);

        CartPage cartPage = productCatalog.goToCartPage();
        Boolean match = cartPage.verifyProductDisplay("ZARA COAT 33");
        Assert.assertFalse(match);

    }
}
