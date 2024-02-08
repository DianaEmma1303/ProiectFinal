
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginTests extends BasePage {
    private LoginPage LoginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        LoginPage = new LoginPage(driver);

    }
    @Test
    public void EnterDinoUserAndCheckTheResult(){
        LoginPage.ClickOnLoginIcon();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
    @Test
    public void EnterBeetleUserAndCheckTheResult() {
        LoginPage.ClickOnLoginIcon();
        LoginPage.EnterTextInUsernameField("beetle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("beetle"));
    }

    @Test
    public void EnterTurtleUserAndCheckTheResult() {
        LoginPage.ClickOnLoginIcon();
        LoginPage.EnterTextInUsernameField("turtle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }
    @Test
    public void EnterLockedUserAndCheckTheResult() {
        LoginPage.ClickOnLoginIcon();
        LoginPage.EnterTextInUsernameField("locked");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("The user has been locked out."));
    }

}

