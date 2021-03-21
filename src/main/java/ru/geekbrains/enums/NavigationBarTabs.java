package ru.geekbrains.enums;

import org.openqa.selenium.By;

public enum NavigationBarTabs {
    MY_BLOG("//body[@id='body']/div[2]/div/ul[2]/li/a/span"),
    NEW_ENTRY("//body[@id='body']/div[2]/div/ul[2]/li[2]/a/span"),
    FAVORITES("//body[@id='body']/div[2]/div/ul[2]/li[3]/a/span"),
    DISCUSSIONS("//body[@id='body']/div[2]/div/ul[2]/li[3]/a/span"),
    MENTIONING("//body[@id='body']/div[2]/div/ul[2]/li[4]/a/span"),
    MESSAGES("//body[@id='body']/div[2]/div/ul[2]/li[5]/a/span"),
    CUSTOMIZATION("//body[@id='body']/div[2]/div/ul[2]/li[6]/a/span"),
    AVATAR("//body[@id='body']/div[2]/div/ul[2]/li[6]/a/span"),
    USERNAME("//body[@id='body']/div[2]/div/ul[2]/li[7]/a/span");

    private final By by;

    NavigationBarTabs(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
