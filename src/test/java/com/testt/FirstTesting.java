package com.testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTesting {

    @Test
    public void first_testmethod() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //for setting web driver as system property
       // System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        //WebDriver driver=new FirefoxDriver();
       // driver.get("http://www.kalaiselvana.info");
        driver.get("http://127.0.0.1:9090/");
        System.out.println("hai this link has been opened");
        driver.quit();
    }
}
