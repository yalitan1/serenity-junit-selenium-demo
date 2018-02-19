package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {

    @FindBy(xpath = "//h3[@class='r']")
    WebElement itemName;


    public String getItemName() {
        return itemName.getText();
    }

}
