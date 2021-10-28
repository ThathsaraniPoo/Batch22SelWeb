package com.guru99;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistration {
//    @Test - This method is not accurate
//    public void testRegisterationNewUser() {
//        System.setProperty("webdriver.chrome.driver", "/home/dasitha/Documents/poornima doc/Batch22SelWeb/src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.guru99.com/selenium/newtours/index.php" );
//
//    }

    @Test
    public void testRegistrationNewUser2() {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("http://demo.guru99.com/selenium/newtours/index.php");
        dr.manage().window().maximize();

        //dr.findElement(By.linkText("REGISTER")).click();  -> this method is not accurate -> for click events
        WebElement webElement = dr.findElement(By.linkText("REGISTER"));
        webElement.click();

        try {
            Thread.sleep(3000);//We can sleep the testing for 3000 millis
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            dr.findElement(By.name("firstName")).sendKeys("Thathsarani"); // For Input fields
            dr.findElement(By.name("lastName")).sendKeys("Poornima");
            dr.findElement(By.name("phone")).sendKeys("0713452999");
            dr.findElement(By.id("userName")).sendKeys("thath@gmail.com");

        Select dropdowncountryelement= new Select(dr.findElement(By.name("country")));
        dropdowncountryelement.selectByVisibleText("ANTARCTICA");
        dropdowncountryelement.selectByValue("BAHAMAS");
        dropdowncountryelement.selectByIndex(4);

        dr.findElement(By.name("email")).sendKeys("thath@gmail.com");
        dr.findElement(By.name("password")).sendKeys("pass@1234"); //
        dr.findElement(By.name("confirmPassword")).sendKeys("pass@1234");
        dr.findElement(By.name("submit")).click();

        String message= dr.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
        Assert.assertEquals(message,"Dear Thathsarani Poornima,");
    }
}
