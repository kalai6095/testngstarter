package com.chrom;

import com.base.BaseTest;
import org.testng.annotations.Test;

public class BeforeAndAfterfromBaseTest extends BaseTest {

    @Test
    public void first_testmethod() {
        //for setting web driver as system property

        driver.get("http://127.0.0.1:9090/");
        System.out.println("Link has been opened automation Testing will be initiated...");

    }
}
