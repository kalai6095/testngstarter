package com.base;

import com.base.pages.SecondPageInputs;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObjects<T> {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePageObjects(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 40);
    }

    protected T getPage(String url) {
        driver.get(url);
        return (T) this;
    }

    protected void type(String text, By element) {
        find(element).sendKeys(text);
    }

    protected void select(String text, By element) {
        WebElement fis = find(element);
        fis.sendKeys(text);
        // driver.findElement(element)
        driver.switchTo().alert().accept();
    }


    protected SecondPageInputs click(By element) {
        find(element).click();
        return new SecondPageInputs(driver);
    }

    protected void hitEditButton(By element) {
        WebElement e = find(element);
       // System.out.println(e.getTagName());
        e.sendKeys("Hi this is kalaiselvan.a ");
        e.click();
        driver.switchTo().alert().accept();
    }

    private WebElement find(By element) {
        return driver.findElement(element);
    }

    protected void waitForVisibility(By element, Integer... timeOutInSeconds) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(element), ((timeOutInSeconds.length > 0) ? timeOutInSeconds[0] : 40));
            } catch (StaleElementReferenceException e) {
                System.out.println(e.toString());
            }
            attempts++;
        }
    }

    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(condition);
    }

    protected String getTitleofPage() {
        return driver.getTitle();
    }
}
