package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait wait;

    public  BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        PageFactory.initElements(webDriver, this);
    }

    protected void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected  void waitForClickability(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForPresence(String element){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
    }
}
