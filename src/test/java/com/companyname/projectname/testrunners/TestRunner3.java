package com.companyname.projectname.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = "com.companyname.projectname.steps",
                 tags="@bhavani3")
public class TestRunner3 {
}