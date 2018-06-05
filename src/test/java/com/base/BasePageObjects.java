package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
      WebElement  fis= find(element);
      fis.sendKeys(text);
       // driver.findElement(element).
    }

    protected  void click(By element){
        find(element).click();
    }

    private WebElement find(By element){
        return driver.findElement(element);
    }


}
