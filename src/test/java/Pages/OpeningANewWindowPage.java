package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpeningANewWindowPage extends BaseTest {

    public OpeningANewWindowPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Click Here")
    WebElement clickHereButton;

    //--------------------------

    public void clickOnClickHereButton(){
        clickHereButton.click();
    }
}
