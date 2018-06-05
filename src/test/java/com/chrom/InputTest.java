package com.chrom;

import com.base.BaseTest;
import com.base.pages.Inputs;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {

    @Test
    public void input_Test() {
        Inputs in = new Inputs(driver);
        //driver.get("http://localhost:9090");
        in.openLoginPage();
        in.fillInputsManual("hai this is kalaiselvan new to selenium testing","firstdomain");
        in.push_submit();
    }
}
