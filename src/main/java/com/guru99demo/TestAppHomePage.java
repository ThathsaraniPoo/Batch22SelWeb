package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppHomePage {
    WebDriver dr = TestApp.getInstance().getDriver();
    PropertyFileReader prop= new PropertyFileReader();
    String registerMenuElement = prop.getProperty("TestAppHomePage" ,"register.menu.element");

    public  TestAppRegisterPage clickOnRegisterLink() {
        TestApp.getInstance().waitForElement(By.linkText(registerMenuElement),20);
        dr.findElement(By.linkText("REGISTER")).click();
        return  new TestAppRegisterPage();
    }
}
