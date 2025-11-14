package org.example.pages.elements.components;

import org.example.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "userName")
    private WebElement usernameField;

    @FindBy(id = "userEmail")
    private WebElement userEmailField;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//li[@id='item-0']//span[text()='Text Box']")
    private WebElement textBoxElement;


    public void clickTextBox(){
        waitForClickability(textBoxElement);
        textBoxElement.click();
    }

    public void typeUsername(String username){
        waitForVisibility(usernameField);
        usernameField.sendKeys(username);
    }

    public void typeUserEmail(String userEmail){
        userEmailField.sendKeys(userEmail);
    }

    public void typeCurrentAddressField(String currentAddress){
        currentAddressField.sendKeys(currentAddress);
    }

    public void typePermanentAddressField(String permanentAddress){
        permanentAddressField.sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        waitForClickability(submitButton);
        JavascriptExecutor script = (JavascriptExecutor) webDriver;
        script.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
    }
}
