package business.concretes;

import business.abstracts.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterByListingDate extends BasePage {

    By filterByListingDateLocator=By.cssSelector("a[data-id=date][title='Son 24 saat']");

    By submitButtonLocator=By.cssSelector("btn btn-block search-submit");

    public FilterByListingDate(WebDriver driver){
        super(driver);
    }

    public void filterByLastDay(){
        click(filterByListingDateLocator);
       /*click(submitButtonLocator);*/
    }

}
