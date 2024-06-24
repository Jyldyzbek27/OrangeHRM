import com.winter24.pages.Enums;
import org.testng.annotations.Test;

import static com.winter24.pages.constants.Constant.URLS.ORANGE_HOME_PAGE;

public class SidePanelMenuTest extends BaseTest {

    @Test
    public void choiceChapter() {
        driver.get(ORANGE_HOME_PAGE);
        orangeHomePage.authorization();
        sidePanelMenuPage.selectSection(Enums.ADMIN);
//        sidePanelMenuPage.selectSection(Enums.PIM);
//        sidePanelMenuPage.selectSection(Enums.LEAVE);
//        sidePanelMenuPage.selectSection(Enums.TIME);
//        sidePanelMenuPage.selectSection(Enums.RECRUITMENT);
//        sidePanelMenuPage.selectSection(Enums.MYINFO);
//        sidePanelMenuPage.selectSection(Enums.PERFORMANCE);
//        sidePanelMenuPage.selectSection(Enums.DASHBOARD);
//        sidePanelMenuPage.selectSection(Enums.DIRECTORY);
//        sidePanelMenuPage.selectSection(Enums.MAINTENANCE);
//        sidePanelMenuPage.selectSection(Enums.CLAIM);
//        sidePanelMenuPage.selectSection(Enums.BUZZ);
    }
}
