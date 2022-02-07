package business.pages;

import business.concretes.SearchBox;
import core.PageCommon;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageCommon {

    SearchBox searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }
    public SearchBox searchBox()
    {
    return this.searchBox;
    }
}
