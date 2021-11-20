package com.guru99;

import com.guru99demo.HomeFactoryPage;
import com.guru99demo.RegisterFactoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest5 {

    HomeFactoryPage homeFactoryPage = null;
    RegisterFactoryPage registerFactoryPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homeFactoryPage = PageFactory.initElements(TestApp.getInstance().getDriver(), HomeFactoryPage.class);
        registerFactoryPage = homeFactoryPage.clickOnRegisterPage();

    }

    @Test
    public void testRegistration() {
        registerFactoryPage
                .setfName("Thathsarani")
                .setLastName("Poornima")
                .setemail("nsdjij@gmail.com")
                .setphone("0114911304")
                .setpasword("ww12345")
                .setConfirmPassword("ww12345")
                .setUserName("HDT Poornima")
                .submit();


    }
}
