package com.winter24.pages.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.winter24.pages.drivers.DriverManager.driver;

public class OrangeHomePage extends BasePage{


    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUserName;

    @FindBy(css = "input[type='password']")
    public WebElement inputPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    public OrangeHomePage authorization(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        inputUserName.sendKeys("Admin");
        inputPassword.sendKeys("admin123");
        loginButton.click();
        return this;
    }

}
