package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    private final WebDriverWait webDriverWait;

    public  BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    protected WebElement find(By locator){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void type(By locator, String text){
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }

    public boolean isDisplayed(By locator){
        try{
            return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator))!=null;
        }
        catch (Exception e){
            return false;
        }
    }
}
