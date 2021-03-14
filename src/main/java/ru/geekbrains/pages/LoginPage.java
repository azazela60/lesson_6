package ru.geekbrains.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.base.BaseView;

public class LoginPage extends BaseView {

    @FindBy(xpath = ".//*[@id=\\\"drop-login\\\"]")
    private WebElement buttonSignIn;

    @FindBy(css = "input[id='usrlog2']")
    private WebElement inputLogin;

    @FindBy(css = "input[id='usrpass2']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//*[@id=\"signin_btn\"]")
    private WebElement button1SignIn;

//    @FindBy(xpath = "//input[@type='checkbox']")
//    private WebElement inputCheck;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

   public LoginPage clickLoginButton() {
        buttonSignIn.click();
 //       return new HomePage(driver);
        return this;
    }

    public LoginPage enterLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginPage enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    public HomePage clickLoginButton1() {
        button1SignIn.click();
        return new HomePage(driver);
    }


    // Для использования в других тестах
    public HomePage authoriseScenario(String login, String password) {
        buttonSignIn.click();
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        button1SignIn.click();
        return new HomePage(driver);
    }
}


