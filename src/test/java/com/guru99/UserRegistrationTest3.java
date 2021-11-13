package com.guru99;

import com.guru99demo.RegisterSuccess;
import com.guru99demo.TestAppHomePage;
import com.guru99demo.TestAppRegisterPage;
import com.guru99demo.TestRegisterSuccessPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest3 {
    TestAppHomePage home;
    TestAppRegisterPage regPage;
    TestRegisterSuccessPage successpage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

        home= new TestAppHomePage();
        home.clickOnRegisterLink();
        regPage= new TestAppRegisterPage();

    }

    @Test
    public void testUserRegistration() {
        regPage.regName("Thathsarani");
        regPage.regLastName("Poornima");
        regPage.regemail("hdhhfh@gmail.com");
        regPage.regphone("011458212");
        regPage.regepass("fhfhfh@jfj");
        regPage.regePassConfirm("fhfhfh@jfj");
        regPage.reguserName("hdhhfh@gmail.com");
        regPage.subbutton();
        TestRegisterSuccessPage testRegisterSuccessPage= new TestRegisterSuccessPage();
        testRegisterSuccessPage.success();
    }
}
