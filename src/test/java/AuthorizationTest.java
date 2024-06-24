import org.testng.annotations.Test;

import static com.winter24.pages.constants.Constant.URLS.ORANGE_HOME_PAGE;


public class AuthorizationTest extends BaseTest {


    @Test
    public void logInToTheSiteOrangeHRM() {
        driver.get(ORANGE_HOME_PAGE);
        orangeHomePage.authorization();
    }
}
