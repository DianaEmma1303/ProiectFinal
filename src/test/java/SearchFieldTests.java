import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.OrderPage;
import pages.SearchFieldPage;

public class SearchFieldTests extends BasePage {
    private SearchFieldPage SearchFieldPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SearchFieldPage = new SearchFieldPage(driver);


    }

    @Test
    public void EnterTheTextLicensedAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Licensed");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Licensed Steel Gloves"));

    }

    @Test
    public void EnterTheTextGorgeousAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Gorgeous");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Gorgeous Soft Pizza"));

    }

    @Test
    public void EnterTheTextAwesomeAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Awesome");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));

    }

    @Test
    public void EnterTheTextIncredibleAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Incredible");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incredible Concrete Hat"));


    }
    @Test
    public void EnterTheTextPracticalAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Practical");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));


    }

    @Test
    public void EnterTheTextRefinedAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Refined");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));


    }

    @Test
    public void EnterTheTextMouseAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Mouse");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Metal Mouse"));


    }
    @Test
    public void EnterTheTextSoftShirtAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Soft Shirt");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));


    }
    @Test
    public void EnterTheTextChairAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Chair");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Metal Chair"));


    }

    @Test
    public void EnterTheTextBaconAndClickOnTheSearchButton() {
        SearchFieldPage.EnterTextInSearchField("Bacon");
        SearchFieldPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));


    }

}
