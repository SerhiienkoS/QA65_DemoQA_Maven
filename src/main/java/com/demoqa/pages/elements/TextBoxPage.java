package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public TextBoxPage enterDataWithJS(String name, String email) {
        js.executeScript("document.getElementById('userName').value='"+name+"';");
        js.executeScript("document.getElementById('userName').style.border='5px solid red';");

        js.executeScript("document.getElementById('userEmail').value ='" + email + "';");
        js.executeScript("document.getElementById('userEmail').style.border='10px solid green';");
        return this;
    }
    public TextBoxPage clickOnSubmitWithJS() {
        js.executeScript("document.querySelector('#submit').style.backgroundColor='Red';");
        js.executeScript("document.querySelector('#submit').click();");
        return this;
    }

    public TextBoxPage refreshWithJS() {
        js.executeScript("history.go(0);");
        return this;
    }

    public TextBoxPage getInnerTextJS() {
        String innerText = js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(innerText);
        System.out.println("*******************************************");
        return this;
    }
}

