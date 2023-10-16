package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class KeyPressesTest extends BaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void keyPressesInputTest(){
    homePage.clickOnKeyPressesButton();
    String keyToSend = "K";
    keyPressesPage.inputKeys(keyToSend);
    Assert.assertTrue(keyPressesPage.resultMessage.isDisplayed());
    String expectedMessage = "You entered: " + keyToSend;
    Assert.assertEquals(keyPressesPage.resultMessage.getText().toLowerCase(Locale.ROOT), expectedMessage.toLowerCase());
    }


}
