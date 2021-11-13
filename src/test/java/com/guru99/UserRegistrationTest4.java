package com.guru99;

import com.guru99demo.TestAppHomePage;
import com.guru99demo.TestAppRegisterPage;
import com.guru99demo.TestRegisterSuccessPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest4 {
    TestAppHomePage homePage;
    TestAppRegisterPage regPage;
    TestRegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void beforeMethod() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new TestAppHomePage();
        regPage = homePage.clickOnRegisterLink();
    }

    @Test
    public void testUserRegistration() {
       registerSuccessPage = regPage
                .regName("Poornima")
                .regLastName("Thathsarani")
                .regphone("0112801152")
                .regemail("hhfhf@gmail.com")
                .regepass("disdi")
                .regePassConfirm("disdi")
                .reguserName("dndj@gmail.com")
                .subbutton();
        String actualMessage = registerSuccessPage.success();
        Assert.assertEquals(actualMessage, "Dear Poornima Thathsarani,");
    }

}
