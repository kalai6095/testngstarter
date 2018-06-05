package com.chrom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondClass {

    private WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }
    }


    @AfterClass
    public void down() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void first_testmethod() {
        //for setting web driver as system property

        driver.get("http://127.0.0.1:9090/");
        System.out.println("Link has been opened automation Testing will be initiated...");

    }
}
