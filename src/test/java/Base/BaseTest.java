package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public KeyPressesPage keyPressesPage;
    public OpeningANewWindowPage openingANewWindowPage;
    public NewWindowPage newWindowPage;
    public DropdownPage dropdownPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage();
        keyPressesPage = new KeyPressesPage();
        openingANewWindowPage = new OpeningANewWindowPage();
        newWindowPage = new NewWindowPage();
        dropdownPage = new DropdownPage();
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }
}
