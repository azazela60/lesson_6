package ru.geekbrains.views;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ru.geekbrains.base.BaseView;
import ru.geekbrains.base.SubMenu;
import ru.geekbrains.enums.NavigationBarTabs;

public class NavigationBar extends BaseView {

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();
        switch (tab) {
            case DISCUSSIONS:
                return new ExpenseSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currently not implemented");
        }
    }

    public NavigationBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }
}
