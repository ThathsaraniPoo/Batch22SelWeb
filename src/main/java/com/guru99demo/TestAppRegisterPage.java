package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class TestAppRegisterPage {

    WebDriver dr = TestApp.getInstance().getDriver();
    public TestAppRegisterPage regName (String firstName){
        TestApp.getInstance().waitForElement(dr, By.name("firstName"), 20);
        dr.findElement(By.name("firstName")).sendKeys(firstName);
        return this;
    }
    public TestAppRegisterPage regLastName (String lastName){
        TestApp.getInstance().waitForElement(dr,By.name("lastName"), 20);
        dr.findElement(By.name("lastName")).sendKeys(lastName);
        return this;
    }
    public TestAppRegisterPage regphone (String phoneNumber){
        dr.findElement(By.name("phone")).sendKeys(phoneNumber);
        return this;
    }
    public TestAppRegisterPage regemail(String email){
        dr.findElement(By.name("email")).sendKeys(email);
        return this;
    }
    public TestAppRegisterPage reguserName(String userName){
        dr.findElement(By.id("userName")).sendKeys(userName);
        return this;
    }

    public TestAppRegisterPage regepass(String password){
        dr.findElement(By.name("password")).sendKeys(password);
        return this;
    }
    public TestAppRegisterPage regePassConfirm(String setPassword){
        dr.findElement(By.name("confirmPassword")).sendKeys(setPassword);
        return this;
    }
    public TestRegisterSuccessPage subbutton(){
        dr.findElement(By.name("submit")).click();
        return new TestRegisterSuccessPage();
    }

}
