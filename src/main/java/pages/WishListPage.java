package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends BasePage {
    public WishListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeGraniteChipsWishList;

    public void AddAwesomeGraniteChipsToTheWishList() {
        AwesomeGraniteChipsWishList.click();

    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg")
    private WebElement AwesomeMetalChair;

    public void AddAwesomeMetalChairToTheWishList() {
        AwesomeMetalChair.click();


    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeSoftShirt;
    public void AddAwesomeSoftShirtToTheWishList(){
        AwesomeSoftShirt.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement GorgeousSoftPizza;
    public void AddGorgeousSoftPizzaToTheWishList(){
        GorgeousSoftPizza.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement IncredibleConcreteHat;
    public void AddIncredibleConcreteHatToTheWishList(){
        IncredibleConcreteHat.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg")
    private WebElement LicensedSteelGloves;
    public void AddLicensedSteelGlovesToTheWishList(){
        LicensedSteelGloves.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement PracticalMetalMouse;
    public void AddPracticalMetalMouseToTheWishList(){
        PracticalMetalMouse.click();
    }

    @FindBy (css= "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement PracticalWoodenBacon;
    public void AddPracticalWoodenBaconToTheWishList(){
        PracticalWoodenBacon.click();

    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement SecondPracticalWoodenBacon;
    public void AddTheSecondPracticalWoodenBaconToTheWishList(){
        SecondPracticalWoodenBacon.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement RefinedFrozenMouse;
    public void AddRefinedFrozenMouseToTheWishList(){
        RefinedFrozenMouse.click();
    }

}
