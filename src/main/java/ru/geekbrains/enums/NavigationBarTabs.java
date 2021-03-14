package ru.geekbrains.enums;

import org.openqa.selenium.By;

public enum NavigationBarTabs {
    MY_BLOG(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[1]/a' and text()='Мой дневник']"),
    NEW_ENTRY(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[2]/a' and text()='Новая запись']"),
    FAVORITES(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[3]/a' and text()='Избранное']"),
    DISCUSSIONS(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[4]/a' and text()='Дискусии']"),
    MENTIONING(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[5]/a' and text()='Упоминания']"),
    MESSAGES(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[6]/a' and text()='U-mail']"),
    CUSTOMIZATION(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[7]/a' and text()='Настройки']"),
    AVATAR(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[8]/a='avatar']"),
    USERNAME(".//*[@id=\"body\"]/div[3]/div/ul[2]/li[9]/a' and text()='username']");

    private final By by;

    NavigationBarTabs(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
