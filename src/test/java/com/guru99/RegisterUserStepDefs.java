package com.guru99;

import com.guru99demo.HomeFactoryPage;
import com.guru99demo.RegisterFactoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegisterUserStepDefs {

    HomeFactoryPage homeFactoryPage = null;
    RegisterFactoryPage registerFactoryPage;


    @Given("^User is on Home Page -->Register Page$")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homeFactoryPage = PageFactory.initElements(TestApp.getInstance().getDriver(), HomeFactoryPage.class);
        registerFactoryPage = homeFactoryPage.clickOnRegisterPage();

    }

    @Given("^User enter first name as \"([^\"]*)\"$")
    public void setFirstName(String firstName) {
        registerFactoryPage.setfName(firstName);
    }

    @And("^User enter last name as \"([^\"]*)\"$")
    public void setLastName(String lastName) {
        registerFactoryPage.setLastName(lastName);
    }

    @And("^User enter phone  as \"([^\"]*)\"$")
    public void setPhone(String phone) {
        registerFactoryPage.setphone(phone);

    }

    @And("^User enter email as \"([^\"]*)\"$")
    public void setEmail(String email) {
        registerFactoryPage.setemail(email);

    }

    @And("^User enter user name as \"([^\"]*)\"$")
    public void setUserName(String userName) {
        registerFactoryPage.setUserName(userName);

    }

    @And("^User enter password as \"([^\"]*)\"$")
    public void setPassword(String password) {
        registerFactoryPage.setpasword(password);

    }

    @And("^User enter confirm password as \"([^\"]*)\"$")
    public void serComfirmPassword(String confirmPassword) {
        registerFactoryPage.setConfirmPassword(confirmPassword);

    }

    @When("^User clicks on Submit button$")
    public void submit() {
        registerFactoryPage.submit();
    }

    @Then("^The actualMessage displays as \"([^\"]*)\"$")
    public void setActualMessage(String actualMessage) {

    }
}
