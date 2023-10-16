package Tests;

import Base.BaseTest;
import Pages.DropdownPage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void dropdownTest(){
    homePage.clickOnDropdownButton();
    int x = 1;
    dropdownPage.clickOnOptionFromDropdown(x);
    String expectedText = "Option " + x;
        //System.out.println(dropdownPage.options.get(x).getText());
        Assert.assertEquals(dropdownPage.getTextForSelectedOption(x), expectedText);

    }
}
