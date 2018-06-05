package com.chrom;

import com.base.BaseTest;
import com.base.pages.Inputs;
import com.base.pages.SecondPageInputs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {

    private static final String TITLE = "::simple form design2::";

    @Test
    public void input_Test() {
        Inputs in = new Inputs(driver);
        //driver.get("http://localhost:9090");
        in.openLoginPage();
        in.fillInputsManual("hai this is kalaiselvan new to selenium testing", "firstdomain");
        SecondPageInputs sc = in.push_submit();
        sc.waitForSecondPage();
        sc.hitEdit();
        String title = sc.getTitle();
        Assert.assertTrue(TITLE.equals(title), "Page title is not Expected /\n Expected was :" + TITLE);
        //Assert.assertTrue();
    }
}
