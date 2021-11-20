package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegisterFactoryPage {
    @FindBy(name = "firstName") private WebElement firstNameElement;
    @FindBy(name = "lastName") private WebElement lastNameElement;
    @FindBy(name = "phone") private WebElement phoneNumberElelemnt;
    @FindBy(id= "userName") private WebElement emailElement;
    @FindBy(id = "email") private WebElement userNameElement;
    @FindBy(name = "password") private WebElement passwordElelemt;
    @FindBy(name = "confirmPassword") private WebElement confirmPasswordElement;
    @FindBy(name = "submit") private WebElement submitbuttondElement;

public RegisterFactoryPage setfName(String firstName){
    TestApp.getInstance().waitForElement(By.name("firstName"),20);
    firstNameElement.sendKeys(firstName);
    return this;
}

public  RegisterFactoryPage setLastName(String lastName){
    lastNameElement.sendKeys(lastName);
    return  this;
}
    public  RegisterFactoryPage setphone(String phone){
        phoneNumberElelemnt.sendKeys(phone);
        return  this;
    }
    public  RegisterFactoryPage setemail(String email){
        emailElement.sendKeys(email);
        return  this;
    }
    public  RegisterFactoryPage setUserName(String userName){
        userNameElement.sendKeys(userName);
        return  this;
    }
    public  RegisterFactoryPage setpasword(String password){
        passwordElelemt.sendKeys(password);
        return  this;
    }
    public  RegisterFactoryPage setConfirmPassword(String confirmPassword){
        confirmPasswordElement.sendKeys(confirmPassword);
        return  this;
    }
    public RegisterSuccessFactoryPage submit(){
    submitbuttondElement.click();
    return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterSuccessFactoryPage.class);
    }
}
