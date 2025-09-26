package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.SliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SlederTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectSlider().hideIframes();
    }

    @Test
    public void slederTest(){
        new SliderPage(driver).moveSliderInHorizontaleDeirection()
        .verifySlider("58");
    }

}
