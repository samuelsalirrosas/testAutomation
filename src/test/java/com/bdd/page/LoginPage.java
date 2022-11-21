package com.bdd.page;

import base.Browser;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sodimac.com.pe/sodimac-pe/myaccount/login")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Iniciar Sesión')]")
    WebElement labelLogin;

    @FindBy(xpath = "//input[@id='login_form_email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='login_form_password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[contains(text(),'Iniciar sesión segura')]")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@id='login-form']/form[1]/div[1]/div[2]/span")
    WebElement showPassword;

    @FindBy(xpath = "//span[contains(text(),'Samuel')]")
    WebElement labelUsername;

    @FindBy(xpath = "//div[@id='alert-modal']/div[1]/div[1]/div[1]/span/../div")
    WebElement alertWrong;

    @FindBy(xpath = "//button[contains(text(),'Cerrar')]")
    WebElement btnClose;

    String tooltipText = inputEmail.getAttribute("title");

    public void openWebSite(String navegador) {
        Browser.Start(this, navegador);
    }

    public void pressLogin() throws InterruptedException {
        labelLogin.click();
        Thread.sleep(2000);
    }

    public void typeEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void typePassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void pressButtonLogin() throws InterruptedException {
        btnLogin.click();
        Thread.sleep(2000);
    }

    public boolean validateUsername(String username) throws InterruptedException {
        Thread.sleep(2000);
        if(labelUsername.getText().equals(username)){
            return true;
        }
        return false;
    }

    public void showPassword() throws InterruptedException {
        showPassword.click();
        Thread.sleep(2000);
    }


    public boolean validateAlertError(String alert) throws InterruptedException {
        Thread.sleep(2000);
        if(alertWrong.getText().equals(alert)){
            return true;
        }
        return false;
    }

    public void pressButtonClose() throws InterruptedException {
        btnClose.click();
        Thread.sleep(2000);
    }
}
