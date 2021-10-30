package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {


    public void regName (WebDriver dr,String firstName){
        waitUntilNextElement(dr,By.name("firstName"), 20);
        dr.findElement(By.name("firstName")).sendKeys(firstName);
    }
    public void regLastName (WebDriver dr,String lastName){
        waitUntilNextElement(dr,By.name("lastName"), 20);
        dr.findElement(By.name("lastName")).sendKeys(lastName);
    }
    public void regphone (WebDriver dr,String phoneNumber){
        dr.findElement(By.name("phone")).sendKeys(phoneNumber);
    }
    public void regemail(WebDriver dr,String email){
        dr.findElement(By.name("email")).sendKeys(email);
    }
    public void reguserName(WebDriver dr,String userName){
        dr.findElement(By.id("userName")).sendKeys(userName);
    }

    public void regepass(WebDriver dr,String password){
        dr.findElement(By.name("password")).sendKeys(password);
    }
    public void regePassConfirm(WebDriver dr,String setPassword){
        dr.findElement(By.name("confirmPassword")).sendKeys(setPassword);
    }
    public void subbutton(WebDriver dr){
        dr.findElement(By.name("submit")).click();
    }




    private WebElement waitUntilNextElement(WebDriver dr,By Locator,int timeOut){
        WebElement element =new WebDriverWait(dr,timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );
        return element;
    }

}
