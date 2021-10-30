package com.guru99;

import com.guru99demo.Home;
import com.guru99demo.Register;
import com.guru99demo.RegisterSuccess;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserReg2 {

    WebDriver dr;
    Home home;
    Register register;
    RegisterSuccess registerSuccess;
    @BeforeMethod
            public void Setup(){
            WebDriverManager.chromedriver().setup();
            dr = new ChromeDriver();
            dr.get("http://demo.guru99.com/selenium/newtours/index.php");
            dr.manage().window().maximize();
            home=new Home();
           register=new Register();
           registerSuccess=new RegisterSuccess();

    }

    @Test
    public void testRegisternewUser() {
        home.clickOnRegisterLink(dr);
        register.regName(dr,"Thathsarani");
        register.regLastName(dr,"Poornima");
        register.regphone(dr,"0115555555");
        register.regemail(dr,"sdlkdl@gmail.com");
        register.reguserName(dr,"sdlkdl@gmail.com");
        register.regepass(dr,"hiii");
        register.regePassConfirm(dr,"hiii");
        register.subbutton(dr);
        String actualmessage=  registerSuccess.success(dr);
        Assert.assertEquals(actualmessage,"Dear Thathsarani Poornima,");
    }
}
