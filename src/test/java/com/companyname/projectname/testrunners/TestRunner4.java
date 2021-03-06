package com.companyname.projectname.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = "com.companyname.projectname.steps",
                 tags="@bhavani4",
                 plugin = {"pretty", "junit:target/test-runner4-results.xml",
                         "json:target/test-runner4-cucumber-reports.json", "html:target/TestRunner4.html"})
public class TestRunner4 {
}
