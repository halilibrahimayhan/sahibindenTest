package business.pages;

import core.PageCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends PageCommon {

    By filterMegaPhotoLocator= By.id("searchResultLeft-hasMegaPhoto");
    By productTitleLocator=By.cssSelector("a.classifiedTitle");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(filterMegaPhotoLocator);
    }

    public void selectProduct(int i) {
getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productTitleLocator);

    }
}
