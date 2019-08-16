package com.nextbasecrm.utilities;

import com.nextbasecrm.pages.login_navigation.LoginPage;

public class Pages {

    private LoginPage loginPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
