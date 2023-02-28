package org.example;

import TestComponents.BaseTests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

//aaa@aaa.com Pass123456
//clasa 1 - StandAloneTest - in package test
//aici e un test complet end 2 end
public class SubmitOrderTest extends BaseTests {
    String productName = "ZARA COAT 3";

    @Test(dataProvider = "getData", groups = {"Purchase"})
    public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

        ProductCatalog productCatalog = landingPage.loginApplication(input.get("email"), input.get("password"));
        List<WebElement> products = productCatalog.getProductList();
        productCatalog.addProductToCart(input.get("productName"));

        CartPage cartPage = productCatalog.goToCartPage();
        Boolean match = cartPage.verifyProductDisplay(input.get("productName"));
        Assert.assertTrue(match);
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();

        String confirmation = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmation.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
    }

    @Test(dependsOnMethods = {"submitOrder"})
    public void orderHistoryTest() throws InterruptedException {
        ProductCatalog productCatalog = landingPage.loginApplication("aaa@aaa.com", "Pass123456");
        OrderPage orderPage = productCatalog.goToOrdersPage();
        Assert.assertTrue(orderPage.verifyOrderDisplay(productName));

    }



    @DataProvider
    public Object[][] getData() throws IOException {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("email", "aaa@aaa.com");
//        map.put("password", "Pass123456");
//        map.put("productName", "ZARA COAT 3");
//        HashMap<String, String> map1 = new HashMap<String, String>();
//        map1.put("email", "bbbb@bbb.com");
//        map1.put("password", "Pass123456");
//        map1.put("productName", "ADIDAS ORIGINAL");

        List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir") +
                "\\src\\test\\java\\Data\\PurchaseOrder.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};
    }

    //Sau se mai poate scrie asa fara HashMap
//    @DataProvider
//    public Object[][] getData(){
//        return new Object[][] {{"aaa@aaa.com","Pass123456","ZARA COAT 3"},{"bbbb@bbb.com","Pass123456","ADIDAS ORIGINAL"}};
//    }

}
