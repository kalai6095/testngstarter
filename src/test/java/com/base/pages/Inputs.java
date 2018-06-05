package com.base.pages;

import com.base.BasePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inputs extends BasePageObjects<Inputs> {
    private static final String URL = "http://localhost:9090";
    private By username = By.xpath("//input[@id='username']");
    private By domainname = By.xpath("//select[@id='domainname']");
    private By testingbutton_click = By.xpath("//input[@id='testingbutton_click']");

    public Inputs(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        getPage(URL);
    }

    public void fillInputsManual(String usertext, String selecttext) {
        type(usertext, username);
        select(selecttext, domainname);
        //type()
    }

    public SecondPageInputs push_submit() {
       return click(testingbutton_click);
    }
}
