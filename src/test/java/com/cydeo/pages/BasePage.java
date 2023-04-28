package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public abstract class BasePage {

    BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void waitUntilVisibleWait(WebElement webElement) {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            wait.until(ExpectedConditions.invisibilityOf(webElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
