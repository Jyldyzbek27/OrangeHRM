package com.winter24.pages.pages;
import com.winter24.pages.drivers.DriverManager;
import com.winter24.pages.helper.DropDownHelper;
import com.winter24.pages.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElementActions webElementActions = new WebElementActions();
    public DropDownHelper dropDownHelper = new DropDownHelper(DriverManager.getDriver());

}
