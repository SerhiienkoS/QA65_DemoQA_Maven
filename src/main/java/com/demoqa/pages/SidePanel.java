package com.demoqa.pages;

import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import com.demoqa.pages.bookstore.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[.='Login']")
    WebElement login;
    public LoginPage selectLogin() {
        clickWithJS(login,0,800);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJS(alerts,0,300);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;
    public SidePanel selectFrame() {
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;
    public FramePage selectNestedFrames() {
        clickWithJS(nestedFrames,0,300);
        return new FramePage(driver);
    }
    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindows selectBrowserWindows() {
        clickWithJS(browserWindows,0,300);
        return new BrowserWindows(driver);
    }
}