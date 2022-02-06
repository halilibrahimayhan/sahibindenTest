import business.concretes.CategoryPage;
import business.concretes.ProductDetailPage;
import business.concretes.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchOnCategory extends BaseTest {

    CategoryPage categoryPage;
    ProductPage productsPage;
    ProductDetailPage productDetailPage;

    @Test
    public void searchOnCategory()
    {
        driver.get("https://www.sahibinden.com/kiralik-daire");
        categoryPage=new CategoryPage(driver);
        productsPage =new ProductPage(driver);


        categoryPage.filterByListingDate().filterByLastDay();
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");

        productDetailPage=new ProductDetailPage(driver);
        productsPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");

    }


}
