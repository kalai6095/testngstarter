package com.chrom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAndAfterMethod {
    private WebDriver driver;

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();

    }


    @AfterMethod
    public void down() {

            driver.quit();

    }


    @Test
    public void first_testmethod() {
        //for setting web driver as system property

        driver.get("http://127.0.0.1:9090/");
        System.out.println("Link has been opened automation Testing will be initiated...");

    }
    @Test
    public void second_testmethod() {
        //for setting web driver as system property

        driver.get("http://127.0.0.1:9090/");
        System.out.println("Link has been opened automation Testing will be initiated...");

    }
}
