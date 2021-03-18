package ru.geekbrains.features.login;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.base.BaseUITest;
import ru.geekbrains.pages.LoginPage;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;
import static ru.geekbrains.common.Configuration.LOGIN;
import static ru.geekbrains.common.Configuration.PASSWORD;

public class PositiveLoginTest extends BaseUITest {


    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .clickLoginButton()
                .enterLogin(LOGIN)
                .enterPassword(PASSWORD)
                .clickLoginButton1();
  //              .checkUrl(BASE_URL);

    }
}
