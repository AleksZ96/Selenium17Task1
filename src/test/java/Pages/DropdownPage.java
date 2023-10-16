package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BaseTest {
    public DropdownPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    public List<WebElement> options;

    /////////////------------------


    public void clickOnOptionFromDropdown(int x){
        Select select = new Select(driver. findElement(By.id("dropdown")));
        select.selectByIndex(x);

        }

        public String getTextForSelectedOption(int x) {
            Select select = new Select(driver. findElement(By.id("dropdown")));
           return select.getOptions().get(x).getText();
        }


    }

