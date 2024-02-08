import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;

public class CartTests extends BasePage {
    private CartPage CartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        CartPage = new CartPage(driver);

    }

    @Test
    public void CheckIfTheFirstItemIsAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void CheckIfTheSecondItemIsAddedToTheCart() {
        CartPage.ClickOnAwesomeMetalChairCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void CheckIfTheThirdItemIsAddedToTheCart() {
        CartPage.ClickOnAwesomeSoftShirtCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfTheFourthItemIsAddedToTheCart() {
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfTheFifthItemIsAddedToTheCart() {
        CartPage.ClickOnIncredibleConcreteHatCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void CheckIfTheSixthItemIsAddedToTheCart() {
        CartPage.ClickOnLicensedSteelGlovesCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfTheSeventhItemIsAddedToTheCart() {
        CartPage.ClickOnPracticalMetalMouseCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfThEighthItemIsAddedToTheCart() {
        CartPage.ClickOnPracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfTheNinthItemIsAddedToTheCart() {
        CartPage.ClickOnTheSecondPracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void CheckIfTheTenthItemIsAddedToTheCart() {
        CartPage.ClickOnTheRefinedFrozenMouseProductCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void CheckIfTheFirstTwoItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));
    }

    @Test
    public void CheckIfTheFirstThreeItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));
    }

    @Test
    public void CheckIfTheFirstFourItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("4"));
    }

    @Test
    public void CheckIfTheFirstFiveItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));
    }

    @Test
    public void CheckIfTheFirstSixItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicensedSteelGlovesCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("6"));
    }

    @Test
    public void CheckIfTheFirstSevenItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicensedSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("7"));

    }

    @Test
    public void CheckIfTheFirstEightItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicensedSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        CartPage.ClickOnPracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("8"));
    }

    @Test
    public void CheckIfTheFirstNineItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicensedSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        CartPage.ClickOnPracticalWoodenBaconCart();
        CartPage.ClickOnTheSecondPracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("9"));
    }

    @Test
    public void CheckIfAllOfTheTenItemsWereAddedToTheCart() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaProductCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicensedSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        CartPage.ClickOnPracticalWoodenBaconCart();
        CartPage.ClickOnTheSecondPracticalWoodenBaconCart();
        CartPage.ClickOnTheRefinedFrozenMouseProductCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("10"));
    }
}
