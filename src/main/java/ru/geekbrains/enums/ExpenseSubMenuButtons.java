package ru.geekbrains.enums;

import org.openqa.selenium.By;
import ru.geekbrains.base.SubMenuButtons;

public enum ExpenseSubMenuButtons implements SubMenuButtons {

    MY_BLOG("//*[@id=\"body\"]/div[3]/div/ul[2]/li[1]/a' and text()='Мой дневник']"),
    NEW_ENTRY("//*[@id=\"body\"]/div[3]/div/ul[2]/li[2]/a' and text()='Новая запись']");



    private final By by;

    ExpenseSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
