package ru.geekbrains.pages;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.base.BaseView;
import ru.geekbrains.views.MenuBar;

public class Page extends BaseView {

    private MenuBar menuBar;

    public Page(WebDriver driver) {
        super(driver);
        this.menuBar = new MenuBar(driver, menuBarTabs);
    }
}
