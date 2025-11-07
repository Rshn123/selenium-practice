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

////        elementPage.clickElement(By.xpath("//ul[@class='menu-list']//span[text()='Text Box']"));
////        boolean value = elementPage.isElementDisplayed(By.xpath("//h1[@class='text-center']"));
////        Assert.assertTrue(value);
////
////        Assert.assertFalse(assertError());
////        elementPage.typeString(By.id("userName"),"username");
////        elementPage.typeString(By.id("userEmail"),"username@gmail.com");
////        elementPage.typeString(By.id("currentAddress"),"current address");
////        elementPage.typeString(By.id("permanentAddress"),"permanent address");
////        js.executeScript("window.scrollBy(0,200)");
////        elementPage.clickElement(By.id("submit"));
//        js.executeScript("window.scrollBy(0,1000)");
//        elementPage.clickElement(By.xpath("//span[@class='group-header']//div[text()='Widgets']"));
//        js.executeScript("window.scrollBy(0,100)");
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        elementPage.clickElement(By.xpath("//ul[@class='menu-list']//span[text()='Select Menu']"));
//
//        Select select = new Select(webDriver.findElement(By.id("withOptGroup")));
//        select.deselectByVisibleText("Group 1, option 1");

        elementPage.clickAlertFrameWindowHeader();
    }

}
