package ru.geekbrains.enums;

import org.openqa.selenium.By;
import ru.geekbrains.base.SubMenuButtons;

public enum ExpenseSubMenuButtons implements SubMenuButtons {

    MY_BLOG("//body[@id='body']/div[2]/div/ul[2]/li/a/span"),
    NEW_ENTRY("//body[@id='body']/div[2]/div/ul[2]/li[2]/a/span");



    private final By by;

    ExpenseSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
