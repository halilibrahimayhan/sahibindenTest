package business.pages;

import core.PageCommon;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends PageCommon {

    public ProductDetailPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return true;
    }
}
