package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

    public  void clickOnRegisterLink(WebDriver dr){
       dr.findElement(By.linkText("REGISTER")).click();

    }
}
