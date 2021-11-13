package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class TestAppHomePage {
    WebDriver dr = TestApp.getInstance().getDriver();

    public  TestAppRegisterPage clickOnRegisterLink() {
        dr.findElement(By.linkText("REGISTER")).click();
        return  new TestAppRegisterPage();
    }
}
