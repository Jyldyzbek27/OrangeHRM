package com.winter24.pages.pages;

import com.winter24.pages.Enums;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanelMenuPage extends BasePage {
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']")
    public WebElement sidePanelBody;

    public void selectSection(Enums enums) {
        sidePanelBody.click();

    }


}
