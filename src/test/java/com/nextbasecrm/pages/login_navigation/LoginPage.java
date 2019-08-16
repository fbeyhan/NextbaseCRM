package com.nextbasecrm.pages.login_navigation;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(name = "USER_LOGIN")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(name = "USER_PASSWORD")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(css = "input[class='login-btn']")
    public WebElement loginButtonElement;

    @FindBy(css = "div[class='errortext']")
    public WebElement errorMessageElement;

    @FindBy(className = "custom-checkbox__icon")
    public WebElement rememberMeElement;

    public void login(String username, String password) {
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login() {
        String username = ConfigurationReader.getProperty("helpdeskusername");
        String password = ConfigurationReader.getProperty("helpdeskpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(String role) {
        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("help desk employee")) {
            username = ConfigurationReader.getProperty("helpdeskusername");
            password = ConfigurationReader.getProperty("helpdeskpassword");
        } else if (role.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketingusername");
            password = ConfigurationReader.getProperty("marketingpassword");
        } else if (role.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.getProperty("hrusername");
            password = ConfigurationReader.getProperty("hrpassword");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public String getErrorMessage() {
        return errorMessageElement.getText();
    }

    public void clickRememberMe() {
        BrowserUtils.waitForClickablility(rememberMeElement, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        if (!rememberMeElement.isSelected()) {
            rememberMeElement.click();
        }
    }
    public void goToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }
}
