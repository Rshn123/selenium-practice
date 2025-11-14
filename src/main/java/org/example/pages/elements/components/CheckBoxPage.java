package org.example.pages.elements.components;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//li[@id='item-1']//span[text()='Check Box']")
    WebElement checkBox;

    @FindBy(className = "rct-option-expand-all")
    WebElement expandAllButton;

    @FindBy(className = "rct-option-collapse-all")
    WebElement collapseAllButton;

    public void clickCheckBox(){
        waitForClickability(checkBox);
        checkBox.click();
    }

    public void clickExpandAllButton(){
        waitForClickability(expandAllButton);
        expandAllButton.click();
    }

    public void clickCollapseAllButton(){
        waitForClickability(collapseAllButton);
        collapseAllButton.click();
    }

    public void checkCheckBox(String name){
        webDriver.findElement(By.xpath("//span[@class='rct-text']//span[text()='"+name+"']")).click();
    }

    public void clickCollapseIcon(String nodeName) {
        String xpath = String.format(
                "//span[@class='rct-title' and text()='%s']/ancestor::span[@class='rct-text']//button",
                nodeName
        );
        webDriver.findElement(By.xpath(xpath)).click();
    }


}
