package com.companyname.projectname.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = "com.companyname.projectname.steps",
                 tags="@bhavani2",
                 plugin = {"pretty", "junit:target/test-runner2-results.xml",
                         "json:target/test-runner2-cucumber-reports.json", "html:target/TestRunner2"})
public class TestRunner2 {
}
