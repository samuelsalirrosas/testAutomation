package com.bdd.step;

import com.bdd.page.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginStep extends ScenarioSteps {
    LoginPage loginPage;

    @Step
    public void openWebSite(String browser) {
        loginPage.openWebSite(browser);
    }

    public void pressLogin() throws InterruptedException {
        loginPage.pressLogin();
    }

    public void typeEmail(String email) {
        loginPage.typeEmail(email);
    }

    public void typePassword(String password) {
        loginPage.typePassword(password);
    }

    public void pressButtonLogin() throws InterruptedException {
        loginPage.pressButtonLogin();
    }

    public void validateUsername(String username) throws InterruptedException {
        loginPage.validateUsername(username);
    }

    public void showPassword() throws InterruptedException {
        loginPage.showPassword();
    }

    public void validateAlertError(String alert) throws InterruptedException {
        loginPage.validateAlertError(alert);
    }

    public void pressButtonClose() throws InterruptedException {
        loginPage.pressButtonClose();
    }
}
