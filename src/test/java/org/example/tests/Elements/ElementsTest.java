package org.example.tests.Elements;

import org.example.config.Config;
import org.example.pages.elements.ElementPage;
import org.example.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsTest extends BaseTest {
    @Test
    private void firstTest(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        String url = Config.get("base.url","");
        ElementPage elementPage = new ElementPage(webDriver);
        webDriver.get(url+"elements");
        elementPage.clickElementHeader();
    }

}
