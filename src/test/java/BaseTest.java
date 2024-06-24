import com.winter24.pages.drivers.DriverManager;
import com.winter24.pages.helper.BrowserHelper;
import com.winter24.pages.helper.WebElementActions;
import com.winter24.pages.pages.OrangeHomePage;
import com.winter24.pages.pages.SidePanelMenuPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected WebElementActions webElementActions;
    protected BrowserHelper browserHelper;
    protected OrangeHomePage orangeHomePage;
    protected SidePanelMenuPage sidePanelMenuPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = DriverManager.getDriver();
        webElementActions = new WebElementActions();
        browserHelper = new BrowserHelper(driver);
        orangeHomePage = new OrangeHomePage();
        sidePanelMenuPage = new SidePanelMenuPage();

    }

}
