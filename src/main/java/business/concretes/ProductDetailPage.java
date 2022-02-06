package business.concretes;

import business.abstracts.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return true;
    }
}
