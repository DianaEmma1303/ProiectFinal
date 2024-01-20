package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
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
    @FindBy(css = ".fa-shopping-bag")
    private WebElement HomeButton;

    public void ClickOnHomeButton(){
        HomeButton.click();
    }
}