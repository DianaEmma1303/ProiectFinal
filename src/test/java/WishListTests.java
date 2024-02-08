import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.WishListPage;

public class WishListTests extends BasePage {
    private WishListPage WishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        WishListPage = new WishListPage(driver);
    }

    @Test
    public void CheckIfTheFirstItemIsAddedToTheCart() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void CheckIfTheFirstTwoItemsWereAddedToTheCart() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));
    }

    @Test
    public void CheckIfTheFirstThreeItemsWereAddedToTheCart() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));

    }

    @Test
    public void CheckIfTheFirstFourItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("4"));
    }

    @Test
    public void CheckIfTheFirstFiveItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));


    }

    @Test
    public void CheckIfTheFirstSixItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        WishListPage.AddLicensedSteelGlovesToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("6"));


    }

    @Test
    public void CheckIfTheFirstSevenItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        WishListPage.AddLicensedSteelGlovesToTheWishList();
        WishListPage.AddPracticalMetalMouseToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("7"));


    }

    @Test
    public void CheckIfTheFirstEightItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        WishListPage.AddLicensedSteelGlovesToTheWishList();
        WishListPage.AddPracticalMetalMouseToTheWishList();
        WishListPage.AddPracticalWoodenBaconToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("8"));


    }

    @Test
    public void CheckIfTheFirstNineItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        WishListPage.AddLicensedSteelGlovesToTheWishList();
        WishListPage.AddPracticalMetalMouseToTheWishList();
        WishListPage.AddPracticalWoodenBaconToTheWishList();
        WishListPage.AddTheSecondPracticalWoodenBaconToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("9"));


    }

    @Test
    public void CheckIfAllOfTheTenItemsWereAddedToTheWishList() {
        WishListPage.AddAwesomeGraniteChipsToTheWishList();
        WishListPage.AddAwesomeMetalChairToTheWishList();
        WishListPage.AddAwesomeSoftShirtToTheWishList();
        WishListPage.AddGorgeousSoftPizzaToTheWishList();
        WishListPage.AddIncredibleConcreteHatToTheWishList();
        WishListPage.AddLicensedSteelGlovesToTheWishList();
        WishListPage.AddPracticalMetalMouseToTheWishList();
        WishListPage.AddPracticalWoodenBaconToTheWishList();
        WishListPage.AddTheSecondPracticalWoodenBaconToTheWishList();
        WishListPage.AddRefinedFrozenMouseToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("10"));


    }
}