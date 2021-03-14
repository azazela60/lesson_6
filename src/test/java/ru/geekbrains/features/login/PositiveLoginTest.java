package ru.geekbrains.features.login;

import org.junit.jupiter.api.Test;
import ru.geekbrains.base.BaseUITest;
import ru.geekbrains.pages.LoginPage;

import static ru.geekbrains.common.Configuration.LOGIN;
import static ru.geekbrains.common.Configuration.PASSWORD;

public class PositiveLoginTest extends BaseUITest {

    @Test
    public void loginWithBaseUserTest() {
        LoginPage page = new LoginPage(driver);
        page.clickLoginButton();
        page.enterLogin(LOGIN);
        page.enterPassword(PASSWORD);
        page.clickLoginButton1();
//                  .checkUrl(BASE_URL);
    }
}
