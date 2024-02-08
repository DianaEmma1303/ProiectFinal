import org.aspectj.weaver.ast.Or;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTests extends BasePage {
    private OrderPage OrderPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        OrderPage = new OrderPage(driver);

    }
    @Test
    public void AddTheFirstProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
    @Test
    public void AddTheSecondProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeMetalChair();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddThethirdProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
    @Test
    public void AddTheFourthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFifthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
    @Test
    public void AddTheSixthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheSeventhProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheEighthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnPracticalWoodenBaconCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheNinthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnTheSecondPracticalWoodenBaconCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheTenthProductToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnTheRefinedFrozenMouseProductCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }



    @Test
    public void AddTheFirstTwoProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstThreeProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstFourProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstFiveProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
    @Test
    public void AddTheFirstSixProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstSevenProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstEightProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnPracticalWoodenBaconCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddTheFirstNineProductsToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnPracticalWoodenBaconCart();
        OrderPage.ClickOnTheSecondPracticalWoodenBaconCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddAllTheProductsFromTheListToTheCartAndCompleteTheOrder(){
        OrderPage.ClickOnLoginIcon();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnAwesomeSoftShirtCart();
        OrderPage.ClickOnGorgeousSoftPizzaProductCart();
        OrderPage.ClickOnIncredibleConcreteHatCart();
        OrderPage.ClickOnLicensedSteelGlovesCart();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnPracticalWoodenBaconCart();
        OrderPage.ClickOnTheSecondPracticalWoodenBaconCart();
        OrderPage.ClickOnTheRefinedFrozenMouseProductCart();
        OrderPage.ClickOnShoppingCartBadge();
        OrderPage.ClickOnTheCheckoutButton();
        OrderPage.InsertNameInFirstNameField("Diana");
        OrderPage.InsertNameInLastNameField("Pop");
        OrderPage.InsertAddressInAddressField("Strada Ploiesti 17");
        OrderPage.ClickOnTheContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }



}
