import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class HomeTests extends BasePage {
    private HomePage HomePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        HomePage = new HomePage(driver);

    }
    @Test
    public void ClickOnHomePageAfterLoginDinoUserAndCheckTheResult(){
        HomePage.ClickOnLoginIcon();
        HomePage.EnterTextInUsernameField("dino");
        HomePage.EnterTextInPasswordField("choochoo");
        HomePage.ClickOnLoginButton();
        HomePage.ClickOnHomeButton();
        String actualResult = driver.findElement(By.id("responsive-navbar-nav")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
    @Test
    public void ClickOnHomePageAfterLoginBeetleUserAndCheckTheResult(){
        HomePage.ClickOnLoginIcon();
        HomePage.EnterTextInUsernameField("beetle");
        HomePage.EnterTextInPasswordField("choochoo");
        HomePage.ClickOnLoginButton();
        HomePage.ClickOnHomeButton();
        String actualResult = driver.findElement(By.id("responsive-navbar-nav")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Hi beetle"));
    }

}

