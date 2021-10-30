package com.guru99demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSuccess {
    public String success (WebDriver dr){
        waitUntilNextElement(dr,By.xpath("//*[contains(text(),'Dear')]"),20);
        String message = dr.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
        return  message;
    }
    private WebElement waitUntilNextElement(WebDriver dr,By locator, int timeout) {
        WebElement element = new WebDriverWait(dr, timeout).until(
                ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }


}
