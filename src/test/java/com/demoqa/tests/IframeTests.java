package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertFrameWindows();
    }

    @Test
    public void iFrameTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames()
                .swithToIframeByIndex(1)
                .verifyIframeByText("This is a simple page");

    }
}
