package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage extends BaseTest {
    public KeyPressesPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "target")
    public WebElement inputBox;

    @FindBy(id = "result")
    public WebElement resultMessage;

    //-----------------------
    public void inputKeys(String keysToSend){
        inputBox.sendKeys(keysToSend);
    }

}
