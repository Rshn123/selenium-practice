package org.example.tests.Elements.components;

import org.example.config.Config;
import org.example.pages.elements.ElementPage;
import org.example.pages.elements.components.TextBoxPage;
import org.example.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    TextBoxPage textBoxPage;
    ElementPage elementPage;
    String url;

    @BeforeMethod
    public void startUp(){
        textBoxPage = new TextBoxPage(webDriver);
        url = Config.get("base.url","");
        webDriver.get(url+"elements");
        textBoxPage.clickTextBox();
        elementPage = new ElementPage(webDriver);
    }

    @Test
    public void invalidEmail(){
        textBoxPage.typeUsername("test");
        textBoxPage.typeUserEmail("roshan@gmail.com");
        textBoxPage.typeCurrentAddressField("Current Address");
        textBoxPage.typePermanentAddressField("Permanent Address");
        textBoxPage.clickSubmitButton();
    }

    @Test
    public void validEmailCheck() throws InterruptedException {
        textBoxPage.typeUsername("test");
        textBoxPage.typeUserEmail("com");

        textBoxPage.typeCurrentAddressField("Current Address");
        textBoxPage.typePermanentAddressField("Permanent Address");

        textBoxPage.clickSubmitButton();

        WebElement emailField = webDriver.findElement(By.id("userEmail"));
        String classAttr = emailField.getDomAttribute("class");
        boolean hasErrorClass = classAttr!=null && classAttr.contains("field-error");
        Assert.assertTrue(hasErrorClass);
        Thread.sleep(20000);
    }

}
