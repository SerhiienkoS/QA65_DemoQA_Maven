package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".card:nth-child(6)")

    WebElement bookstore;

    public SidePanel getBookStore() {
        clickWithJS(bookstore,0,800);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindows;
    public SidePanel getAlertFrameWindows() {
        clickWithJS(alertsFrameWindows,0,200);
        return new SidePanel(driver);
    }
}