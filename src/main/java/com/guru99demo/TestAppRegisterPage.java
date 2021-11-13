package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppRegisterPage {

    WebDriver dr = TestApp.getInstance().getDriver();
    PropertyFileReader prop= new PropertyFileReader();
    String firstnameElement= prop.getProperty("TestAppRegisterPage","first.name.element");
    String lastNameElement= prop.getProperty("TestAppRegisterPage","last.name.element");
    String phoumberElement= prop.getProperty("TestAppRegisterPage","phone.number.element");
    String emailElement= prop.getProperty("TestAppRegisterPage","email.element");
    String usernameElement= prop.getProperty("TestAppRegisterPage","user.name.element");
    String passWordElelement= prop.getProperty("TestAppRegisterPage","password.element");
    String confirmPasswordElement= prop.getProperty("TestAppRegisterPage","confirm.password.element");
    String submitElement= prop.getProperty("TestAppRegisterPage","submit.button.element");



    public TestAppRegisterPage regName (String firstName){
      TestApp.getInstance().waitForElement(By.name(firstnameElement),20);
        dr.findElement(By.name(firstnameElement)).sendKeys(firstName);
        return this;
    }
    public TestAppRegisterPage regLastName (String lastName){
        TestApp.getInstance().waitForElement(By.name(lastNameElement),20);
        dr.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }
    public TestAppRegisterPage regphone (String phoneNumber){
        TestApp.getInstance().waitForElement(By.name(phoumberElement),20);
        dr.findElement(By.name(phoumberElement)).sendKeys(phoneNumber);
        return this;
    }
    public TestAppRegisterPage regemail(String email){
        TestApp.getInstance().waitForElement(By.name(emailElement),20);
        dr.findElement(By.name(emailElement)).sendKeys(email);
        return this;
    }
    public TestAppRegisterPage reguserName(String userName){
        TestApp.getInstance().waitForElement(By.name(usernameElement),20);
        dr.findElement(By.id(usernameElement)).sendKeys(userName);
        return this;
    }

    public TestAppRegisterPage regepass(String password){
        TestApp.getInstance().waitForElement(By.name(passWordElelement),20);
        dr.findElement(By.name(passWordElelement)).sendKeys(password);
        return this;
    }
    public TestAppRegisterPage regePassConfirm(String setPassword){
        TestApp.getInstance().waitForElement(By.name(confirmPasswordElement),20);
        dr.findElement(By.name(confirmPasswordElement)).sendKeys(setPassword);
        return this;
    }
    public TestRegisterSuccessPage subbutton(){
        TestApp.getInstance().waitForElement(By.name(submitElement),20);
        dr.findElement(By.name(submitElement)).click();
        return new TestRegisterSuccessPage();
    }

}
