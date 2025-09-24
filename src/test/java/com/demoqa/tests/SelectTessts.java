package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.SelectMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class SelectTessts extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getSelectMenu();
    }
    @Test
    public void selectOldStyleTest(){
        new SelectMenuPage(driver).selectOldStyle("Green")
                .verifyColor("Green");
    }
}
