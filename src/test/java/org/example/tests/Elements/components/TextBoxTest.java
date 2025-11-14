package org.example.tests.Elements.components;

import org.example.config.Config;
import org.example.pages.elements.ElementPage;
import org.example.pages.elements.components.TextBoxPage;
import org.example.tests.BaseTest;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void formValidation(){
        String url = Config.get("base.url","");
        TextBoxPage textBoxPage = new TextBoxPage(webDriver);
        webDriver.get(url+"elements");
        textBoxPage.clickTextBox();
        textBoxPage.typeUsername("test");
    }
}
