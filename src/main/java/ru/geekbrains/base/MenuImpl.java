package ru.geekbrains.base;

import org.openqa.selenium.WebDriver;

public class MenuImpl extends Menu {
    public MenuImpl(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickMenuButton(SubMenuButtons buttons) {
        return null;
    }
}
