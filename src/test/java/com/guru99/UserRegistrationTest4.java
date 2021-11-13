package com.guru99;

import com.guru99demo.TestAppHomePage;
import com.guru99demo.TestAppRegisterPage;
import com.guru99demo.TestRegisterSuccessPage;
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
        homePage =new TestAppHomePage();
       regPage= homePage.clickOnRegisterLink();
    }

    @Test
    public void testUserRegistration() {

     regPage.regName("Poornima");
     regPage.regLastName("Thathsarani");
     regPage.regphone("0112801152");
     regPage.regemail("hhfhf@gmail.com");
     regPage.regepass("disdi");
     regPage.regePassConfirm("disdi");
     regPage.reguserName("dndj@gmail.com");
     registerSuccessPage.success();
    }

}
