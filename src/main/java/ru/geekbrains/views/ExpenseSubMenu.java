package ru.geekbrains.views;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.base.BaseView;
import ru.geekbrains.base.SubMenu;
import ru.geekbrains.base.SubMenuButtons;
import ru.geekbrains.enums.ExpenseSubMenuButtons;
import ru.geekbrains.pages.AllExpensesPage;


public class ExpenseSubMenu extends SubMenu {

    public ExpenseSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ExpenseSubMenuButtons) {
            switch ((ExpenseSubMenuButtons) buttons) {
                case  MY_BLOG:
                    driver.findElement(((ExpenseSubMenuButtons) buttons).getBy()).click();
                    return new AllExpensesPage(driver);
                case NEW_ENTRY:
                    driver.findElement(((ExpenseSubMenuButtons) buttons).getBy()).click();
                    return new AllExpensesPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
