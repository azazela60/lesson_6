package ru.geekbrains.base;

import org.openqa.selenium.WebDriver;

public abstract class Menu extends BaseView {

    public Menu(WebDriver driver) {
        super(driver);
    }

    abstract public BaseView clickMenuButton(SubMenuButtons buttons);
}
