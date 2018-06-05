package com.chrom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FirstTestingchrome {

    private WebDriver driver;

    @Test
    public void first_testmethod() {
        //for setting web driver as system property
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.get("http://www.kalaiselvana.info");
        driver.get("http://127.0.0.1:9090/");
        System.out.println("hai this link has been opened");

    }

    @Test
    public void second_testmethod() {
        //for setting web driver as system property
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.get("http://www.kalaiselvana.info");
        //driver.get("http://127.0.0.1:9090/");
        System.out.println("hai this link has been opened");

    }

    @AfterClass
    public void test_Down() {
        if (driver != null) {
            driver.quit();
        }
    }
}
