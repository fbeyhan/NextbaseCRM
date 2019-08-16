package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import com.nextbasecrm.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinitions {

    Pages pages = new Pages();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        pages.loginPage().goToLoginPage();
    }

    @Then("user logs in as a help desk employee")
    public void user_logs_in_as_a_help_desk_employee() {
        String username = ConfigurationReader.getProperty("helpdeskusername");
        String password = ConfigurationReader.getProperty("helpdeskpassword");
        pages.loginPage().login(username, password);
    }

    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();
    }

}
