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
public class ErrorValidations extends BaseTests {

    @Test
    public void submitOrder() throws IOException, InterruptedException {
        String productName = "ZARA COAT 3";
        ProductCatalog productCatalog = landingPage.loginApplication("aaa@aaa.com", "Pass123a456");
        Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
    }
}
