package business.concretes;

import core.PageCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends PageCommon {

    By searchBoxLocator=By.id("searchText");

    By submitButtonLocator=By.xpath("//button[@type='submit'][@value='Ara']");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String keyword){
        type(searchBoxLocator,keyword);
        click(submitButtonLocator);
    }
}
