package ru.geekbrains.views;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ru.geekbrains.base.BaseView;
import ru.geekbrains.base.Menu;
import ru.geekbrains.enums.ExpenseSubMenuButtons;
import ru.geekbrains.enums.NavigationBarTabs;

public class MenuBar extends BaseView {

    public MenuBar(WebDriver driver) {
        super();
        }
        {
            Actions actions = new Actions(driver);
            actions
                    .moveToElement(driver.findElement(tab.getBy()));

        }

    private void getBaseView() {
    }

    public MenuBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }
}
