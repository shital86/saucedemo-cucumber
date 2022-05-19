package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public void enterFirstname(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterPostalCode(String postalcode) {
        sendTextToElement(postalCode, postalcode);
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueButton);
    }

    public void clickOnFinishBtn() {
        clickOnElement(finishButton);
    }
}
