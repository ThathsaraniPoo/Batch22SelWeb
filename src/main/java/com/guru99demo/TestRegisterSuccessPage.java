package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class TestRegisterSuccessPage {
    WebDriver dr = TestApp.getInstance().getDriver();
    public String success (){
       TestApp.getInstance().waitForElement(dr, By.xpath("//*[contains(text(),'Dear')]"),20);
        String message = dr.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
        return  message;
    }
}
