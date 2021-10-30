package com.guru99;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class UserRegistration {
    //    @Test - This method is not accurate
//    public void testRegisterationNewUser() {
//        System.setProperty("webdriver.chrome.driver", "/home/dasitha/Documents/poornima doc/Batch22SelWeb/src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.guru99.com/selenium/newtours/index.php" );
//
//    }
    WebDriver dr;
//     PropertyFileReader prop = new PropertyFileReader();
//     String url = prop.getProperty("config", "url");

    @Test
    public void testRegistrationNewUser2() {
        WebDriverManager.chromedriver().setup();
        dr = new ChromeDriver();
        dr.get("http://demo.guru99.com/selenium/newtours/index.php");
        dr.manage().window().maximize();

        //dr.findElement(By.linkText("REGISTER")).click();  -> this method is not accurate -> for click events
        WebElement webElement = dr.findElement(By.linkText("REGISTER"));
        webElement.click();

        waitUntilNextElement(By.name("firstName"), 20);
        dr.findElement(By.name("firstName")).sendKeys("Thathsarani"); // For Input fields
        dr.findElement(By.name("lastName")).sendKeys("Poornima");
        dr.findElement(By.name("phone")).sendKeys("0713452999");
        dr.findElement(By.id("userName")).sendKeys("thath@gmail.com");
        dr.findElement(By.name("address1")).sendKeys("4/3,Kappetipola Mawatha");
        dr.findElement(By.name("city")).sendKeys("Kolonnawa");
        dr.findElement(By.name("state")).sendKeys("Western");
        dr.findElement(By.name("postalCode")).sendKeys("ppp");
        waitUntilNextElement((By.name("country")), 20);

        Select dropdowncountryelement = new Select(dr.findElement(By.name("country")));
        dropdowncountryelement.selectByVisibleText("ANTARCTICA");
        dropdowncountryelement.selectByValue("BAHAMAS");
        dropdowncountryelement.selectByIndex(4);

        dr.findElement(By.name("email")).sendKeys("thath@gmail.com");
        dr.findElement(By.name("password")).sendKeys("pass@1234"); //
        dr.findElement(By.name("confirmPassword")).sendKeys("pass@1234");
        dr.findElement(By.name("submit")).click();

        waitUntilNextElement(By.xpath("//*[contains(text(),'Dear')]"), 20);
        String message = dr.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
        Assert.assertEquals(message, "Dear Thathsarani Poornima,");
    }

    private WebElement waitUntilNextElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(dr, timeout).until(
                ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
