package business.concretes;

import business.abstracts.BasePage;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {

    FilterByListingDate filterByListingDate;

    public CategoryPage(WebDriver driver) {
        super(driver);
        filterByListingDate=new FilterByListingDate(driver);
    }
    public FilterByListingDate filterByListingDate()
    {
        return this.filterByListingDate();
    }
}
