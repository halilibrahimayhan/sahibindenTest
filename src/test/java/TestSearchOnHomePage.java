import business.pages.HomePage;
import business.pages.ProductDetailPage;
import business.pages.ProductPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

@Epic("HomePage Search")
@Feature("search bebek arabası and check result")
public class TestSearchOnHomePage extends BaseTest {

    HomePage homePage;
    ProductPage productsPage;
    ProductDetailPage productDetailPage;


    @Story("bebek arabası is typed into the search field on sahibinden.com homepage and the first bebek arabası product is clicked.")
    @Description("Products are listed on the product search page with the name of the product written in the search bar. Then click on the product in the first row.")
    @Test
    @DisplayName("Sahibindencom Header searchText Test")
    public void searchOnHomePage(){

        driver.get("https://www.sahibinden.com");
        homePage=new HomePage(driver);
        productsPage =new ProductPage(driver);

        homePage.searchBox().search("bebek arabası");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");

        productDetailPage=new ProductDetailPage(driver);
        productsPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
}
}
