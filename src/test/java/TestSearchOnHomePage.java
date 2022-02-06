import business.concretes.HomePage;
import business.concretes.ProductDetailPage;
import business.concretes.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class TestSearchOnHomePage extends BaseTest {

    HomePage homePage;
    ProductPage productsPage;
    ProductDetailPage productDetailPage;

    @Test
    @DisplayName("Sahibindencom Header searchText Test")
    public void searchOnHomePage(){

        driver.get("https://www.sahibinden.com");
        homePage=new HomePage(driver);
        productsPage =new ProductPage(driver);


        homePage.searchBox().search("bebek arabası");
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
     
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");

        productDetailPage=new ProductDetailPage(driver);
        productsPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
}
}
