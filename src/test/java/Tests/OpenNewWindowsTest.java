package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewWindowsTest extends BaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }


    @Test
    public void testOpeningNewWindow(){
        homePage.clickOnMultipleWindowsButton();
        openingANewWindowPage.clickOnClickHereButton();
        Assert.assertTrue(newWindowPage.newWindowText.isDisplayed());
    }
}
