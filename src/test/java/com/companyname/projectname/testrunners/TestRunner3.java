package com.companyname.projectname.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = "com.companyname.projectname.steps",
                 tags="@bhavani3",
                 plugin = {"pretty", "junit:target/test-runner3-results.xml",
                         "json:target/test-runner3-cucumber-reports.json", "html:target/TestRunner3"})
public class TestRunner3 {
}
