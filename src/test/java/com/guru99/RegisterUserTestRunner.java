package com.guru99;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.TestApp;


@CucumberOptions(
        features = {"src/test/resources/features/RegisterUser.feature","src/test/resources/features/aaa.feature" },//Can run any feature files as this
        glue = {"com.guru99"},//package name
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty/mercury-tours-RegisterUserTest",
                "json:target/cucumber-reports/json-reports/mercury-tours-RegisterUserTest.json",
                "rerun:target/cucumber-reports/rerun-reports/mercury-tours-RegisterUserTest.txt"
        })



public class RegisterUserTestRunner {


    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        TestApp.getInstance().closeBrowser();
        testNGCucumberRunner.finish();// if you dont have this method u can not get tha report
    }

}
