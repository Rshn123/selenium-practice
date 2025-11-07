package org.example.pages.elements.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage {
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "userEmail")
    private WebElement userEmailField;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void typeUsername(String username){
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
        submitButton.click();
    }
}
