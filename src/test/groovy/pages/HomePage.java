package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.google.com")
public class HomePage extends PageObject {

    @FindBy(name = "q")
    WebElement searchField;

    @FindBy(xpath = "//*[@id='tsf']/div[2]/div[3]/center/input[1]")
    WebElement searchButton;

    public void search() {
        searchButton.click();
    }

    public void enterSearchTerm(String term) {
        searchField.sendKeys(term);
    }

}
