package business.concretes;

import business.abstracts.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchBox extends BasePage {

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
