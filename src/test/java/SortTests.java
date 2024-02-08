import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SortPage;

public class SortTests extends BasePage {
    private SortPage SortPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SortPage = new SortPage(driver);

    }
    @Test
    public void SortByAtoZAndCheckTheResult(){
        SortPage.ClickAndSelectTheTypeOfSorting();
        SortPage.SelectOptionAtoZ();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));
    }

    @Test
    public void SortByZtoAAndCheckTheResult(){
        SortPage.ClickAndSelectTheTypeOfSorting();
        SortPage.SelectOptionZtoA();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));
    }

    @Test
    public void SortByTheLowestToTheHighestPrice(){
        SortPage.ClickAndSelectTheTypeOfSorting();
        SortPage.SelectOptionLowToHigh();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));
    }

    @Test
    public void SortByTheHighestToTheLowestPrice(){
      SortPage.ClickAndSelectTheTypeOfSorting();
      SortPage.SelectOptionHighToLow();
      String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));
    }

    }



