package com.base.pages;

import com.base.BasePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPageInputs extends BasePageObjects<SecondPageInputs> {

    private By edit = By.xpath("//input[@id='edit']");

    public SecondPageInputs(WebDriver driver) {
        super(driver);
    }

    public void waitForSecondPage() {
        waitForVisibility(edit);
    }

    public void hitEdit() {
        hitEditButton(edit);
    }


    public String getTitle() {
        return getTitleofPage();
    }
}
