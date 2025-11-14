package org.example.tests.Elements.components;

import org.example.config.Config;
import org.example.pages.elements.components.CheckBoxPage;
import org.example.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    CheckBoxPage checkBoxPage;
    String url;

    @BeforeMethod
    private void startUp(){
        checkBoxPage= new CheckBoxPage(webDriver);
        url = Config.get("base.url","");
        webDriver.get(url+"elements");
        checkBoxPage.clickCheckBox();
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
        checkBoxPage.clickCollapseIcon("Downloads");
        Thread.sleep(2000640);
    }
}
