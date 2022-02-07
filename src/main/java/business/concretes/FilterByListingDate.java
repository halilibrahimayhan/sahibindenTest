package business.concretes;

import core.PageCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterByListingDate extends PageCommon {

    By filterByListingDateLocator=By.cssSelector("a[data-id=date][title='Son 24 saat']");

    By submitButtonLocator=By.cssSelector("btn btn-block search-submit");

    public FilterByListingDate(WebDriver driver){
        super(driver);
    }

    public void filterByLastDay(){
        click(filterByListingDateLocator);
       click(submitButtonLocator);
    }

}
