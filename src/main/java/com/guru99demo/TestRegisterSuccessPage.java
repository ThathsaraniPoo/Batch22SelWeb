package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestRegisterSuccessPage {
    WebDriver dr = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String messageElement=  prop.getProperty("TestRegisterSuccessPage","success.message.element");

    public String success (){
       TestApp.getInstance().waitForElement( By.xpath(messageElement),20);
        String message = dr.findElement(By.xpath(messageElement)).getText();
        return  message;
    }
}
