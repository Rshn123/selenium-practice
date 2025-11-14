package org.example.tests.Elements.components;

import org.example.config.Config;
import org.example.pages.elements.ElementPage;
import org.example.pages.elements.components.CheckBoxPage;
import org.example.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    CheckBoxPage checkBoxPage;
    String url;
    ElementPage elementPage;


    @BeforeMethod
    private void startUp(){
        checkBoxPage= new CheckBoxPage(webDriver);
        url = Config.get("base.url","");
        webDriver.get(url+"elements");
        checkBoxPage.clickCheckBox();
        elementPage = new ElementPage(webDriver);
    }

    @Test
    private void expandAllCheckBoxTest() throws InterruptedException {
        checkBoxPage.clickExpandAllButton();
    }

    @Test
    private void unExpandAllCheckBoxTest(){
        checkBoxPage.clickCollapseAllButton();
    }

    @Test
    private void clickCollapseAllCheckBoxTest() throws InterruptedException {
        checkBoxPage.clickExpandAllButton();
        checkBoxPage.clickCollapseAllButton();

        //Select home
        checkBoxPage.checkCheckBox("Home");

        //Click again to unselect.
        checkBoxPage.checkCheckBox("Home");

    }

    @Test
    private void clickDropdownButton() throws InterruptedException {
        checkBoxPage.clickCollapseIcon("Home");
        checkBoxPage.clickCollapseIcon("Desktop");
        checkBoxPage.checkCheckBox("Desktop");
        checkBoxPage.clickCollapseIcon("Documents");
        checkBoxPage.checkCheckBox("Documents");
        checkBoxPage.clickCollapseIcon("Downloads");
        boolean isChecked = checkBoxPage.isCheckedByTitle("Documents");
        Assert.assertTrue(isChecked);
        Thread.sleep(20000);
    }
}
