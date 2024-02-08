package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFieldPage extends BasePage{

    public SearchFieldPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "input-search")
    private WebElement SearchField;
    public void EnterTextInSearchField (String text) {
    SearchField.sendKeys(text);
    }


    @FindBy (id = "root")
    private WebElement SearchButton;
    public void ClickOnSearchButton(){
        SearchButton.click();

    }
}
