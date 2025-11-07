package org.example.pages.elements;

import org.example.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementPage extends BasePage {

    public  ElementPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Elements']")
    private WebElement elementHeader;

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Forms']")
    private WebElement formsHeader;

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Alerts, Frame & Windows']")
    private WebElement alertFrameWindowHeader;

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Widgets']")
    private WebElement widgetsHeader;

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Interactions']")
    private WebElement interactionHeader;

    @FindBy(xpath = "//span[@class='group-header']//div[text()='Book Store Application']")
    private WebElement bookStoreHeader;

    public void clickElementHeader(){
        findAndScroll(elementHeader);
        elementHeader.click();
    }

    public void clickFormsHeader(){
        findAndScroll(formsHeader);
        formsHeader.click();
    }

    public void clickAlertFrameWindowHeader(){
        findAndScroll(alertFrameWindowHeader);
        alertFrameWindowHeader.click();
    }

    public void clickWidgetHeader(){
        findAndScroll(widgetsHeader);
        widgetsHeader.click();
    }

    public void clickInteractionHeader(){
        findAndScroll(interactionHeader);
        interactionHeader.click();
    }

    public void clickBookStoreHeader(){
        findAndScroll(bookStoreHeader);
        bookStoreHeader.click();
    }

    public void findAndScroll(WebElement element){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }
}
