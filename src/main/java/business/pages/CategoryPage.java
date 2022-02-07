package business.pages;

import business.concretes.FilterByListingDate;
import core.PageCommon;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends PageCommon {

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
