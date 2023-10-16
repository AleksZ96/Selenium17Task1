package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Key Presses")
    public WebElement keyPressesButton;

    @FindBy(linkText = "Multiple Windows")
    public WebElement multipleWindowsButton;

    @FindBy(linkText = "Dropdown")
    public WebElement dropdownButton;

    //-------------------

    public void clickOnKeyPressesButton(){
        keyPressesButton.click();
    }

    public void clickOnMultipleWindowsButton(){
        multipleWindowsButton.click();
    }

    public void clickOnDropdownButton(){dropdownButton.click();}
}
