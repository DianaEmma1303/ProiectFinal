package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortPage extends BasePage {
    public SortPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
@FindBy (css = ".sort-products-select")
    private WebElement SelectTheTypeOfSorting;

    public void ClickAndSelectTheTypeOfSorting(){
        SelectTheTypeOfSorting.click();
    }

@FindBy (css = "option[value=az]")
    private WebElement SortByAtoZ;
    public void SelectOptionAtoZ(){
        SortByAtoZ.click();
    }
    @FindBy (css = "option[value=za]")
    private WebElement SortByZtoA;
    public void SelectOptionZtoA(){
        SortByZtoA.click();
    }
 @FindBy (css = "option[value=lohi]")
    private WebElement SortByLoHi;
    public void SelectOptionLowToHigh(){
        SortByLoHi.click();
    }

    @FindBy (css = "option[value=hilo]")
    private WebElement SortByHiLo;
    public void SelectOptionHighToLow() {
        SortByHiLo.click();
    }
}


