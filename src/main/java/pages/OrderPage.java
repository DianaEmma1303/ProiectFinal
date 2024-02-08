package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
    public OrderPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")
    private WebElement LoginIcon;

    public void ClickOnLoginIcon(){
        LoginIcon.click();
    }
    @FindBy(id = "user-name")
    private WebElement UsernameField;

    public void EnterTextInUsernameField(String text){
        UsernameField.sendKeys(text);
    }

    @FindBy(id = "password")
    private WebElement PasswordField;

    public void EnterTextInPasswordField(String text){
        PasswordField.sendKeys(text);
    }
    @FindBy(css = ".btn-primary")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
        LoginButton.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement AwesomeGraniteChipsCart;
    public void ClickOnAwesomeGraniteChipsCart(){
        AwesomeGraniteChipsCart.click();
    }


    @FindBy (css = ".fa-shopping-cart")
    private WebElement ShoppingCartBadge;
    public void ClickOnShoppingCartBadge(){
        ShoppingCartBadge.click();
    }
    @FindBy (css = ".btn-success")
    private WebElement CheckoutButton;
    public void ClickOnTheCheckoutButton (){
        CheckoutButton.click();
    }
    @FindBy (id = "first-name")
    private WebElement FirstNameField;
    public void InsertNameInFirstNameField(String text){
        FirstNameField.sendKeys(text);
    }

    @FindBy (id = "last-name")
    private WebElement LastNameField;
    public void InsertNameInLastNameField(String text){
        LastNameField.sendKeys(text);
    }

    @FindBy (id = "address")
    private WebElement AddressField;
    public void InsertAddressInAddressField(String text){
        AddressField.sendKeys(text);
    }

    @FindBy (css = ".btn-success")
    private WebElement ContinueCheckoutButton;
    public void ClickOnTheContinueCheckoutButton (){
        ContinueCheckoutButton.click();
    }
    @FindBy (css = ".btn-success")
    private WebElement CompleteYourOrderButton;
    public void ClickOnCompleteYourOrderButton (){
        CompleteYourOrderButton.click();
    }
    @FindBy (css = ".text-center")
    private WebElement GetTheTextAfterCompletingTheOrder;


    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeMetalChairCart;
    public void ClickOnAwesomeMetalChair() {
        AwesomeMetalChairCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeSoftShirtCart;
    public void ClickOnAwesomeSoftShirtCart() {
        AwesomeSoftShirtCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement GorgeousSoftPizzaProductCart;
    public void ClickOnGorgeousSoftPizzaProductCart() {
        GorgeousSoftPizzaProductCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement IncredibleConcreteHatCart;
    public void ClickOnIncredibleConcreteHatCart(){
        IncredibleConcreteHatCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement LicensedSteelGlovesCart;
    public void ClickOnLicensedSteelGlovesCart(){
        LicensedSteelGlovesCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalMetalMouseCart;
    public void ClickOnPracticalMetalMouseCart (){
        PracticalMetalMouseCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalWoodenBaconCart;
    public void ClickOnPracticalWoodenBaconCart (){
        PracticalWoodenBaconCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement SecondPracticalWoodenBaconCart;
    public void ClickOnTheSecondPracticalWoodenBaconCart() {
        SecondPracticalWoodenBaconCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement RefinedFrozenMouseProductCart;
    public void ClickOnTheRefinedFrozenMouseProductCart(){
        RefinedFrozenMouseProductCart.click();
    }
}


